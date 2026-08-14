package com.navi.ui.ast;

import com.navi.backend.ast.global.Program;
import lombok.Getter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@Getter
public class AstPanel extends JPanel {

    private static final Color BACKGROUND = new Color(35, 35, 35);
    private static final Color TEXT = new Color(224, 224, 224);
    private static final Color MIKU = new Color(57, 197, 187);

    private final AstTreeBuilder treeBuilder;
    private final TreeDrawingPanel drawingPanel;
    private final JScrollPane scrollPane;

    public AstPanel() {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setBackground(BACKGROUND);

        treeBuilder = new AstTreeBuilder();
        drawingPanel = new TreeDrawingPanel();

        // Wrap the drawing canvas inside a scroll pane to fix the scrolling issue
        scrollPane = new JScrollPane(drawingPanel);
        scrollPane.setBorder(null);
        scrollPane.getViewport().setBackground(BACKGROUND);

        // Customize scrollbar appearance to match the dark theme
        scrollPane.getHorizontalScrollBar().setUnitIncrement(16);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        add(scrollPane, BorderLayout.CENTER);
        clear();
    }

    public void setProgram(Program program) {
        if (program == null) {
            clear();
            return;
        }
        DefaultMutableTreeNode root = treeBuilder.build(program);
        drawingPanel.updateTree(root);
    }

    public void clear() {
        drawingPanel.updateTree(new DefaultMutableTreeNode("Program"));
    }

    /**
     * Inner canvas panel dedicated exclusively to calculating tree layout dimensions
     * and drawing nodes with dynamic padding.
     */
    private static class TreeDrawingPanel extends JPanel {
        private DefaultMutableTreeNode rootNode;

        // Layout constants for UI tuning
        private static final int NODE_PADDING_X = 16;
        private static final int NODE_PADDING_Y = 10;
        private static final int VERTICAL_GAP = 70;
        private static final int HORIZONTAL_GAP_MIN = 40;
        private static final int ARC_SIZE = 12;

        // Font configuration
        private final Font labelFont = new Font(Font.MONOSPACED, Font.BOLD, 13);

        public TreeDrawingPanel() {
            setBackground(BACKGROUND);
            setOpaque(true);
        }

        public void updateTree(DefaultMutableTreeNode root) {
            this.rootNode = root;

            // Trigger layout recalculation based on text lengths before rendering
            revalidate();
            repaint();
        }

        @Override
        public Dimension getPreferredSize() {
            if (rootNode == null) {
                return new Dimension(400, 400);
            }

            // Use a temporary Graphics context to measure text dimensions accurately
            Graphics g = getGraphics();
            FontMetrics fm = (g != null) ? g.getFontMetrics(labelFont) : null;

            // First pass: Compute deep tree dimensions to dynamically scale the viewport
            Map<DefaultMutableTreeNode, Integer> subtreeWidths = new HashMap<>();
            calculateSubtreeWidths(rootNode, fm, subtreeWidths);

            int totalWidth = subtreeWidths.getOrDefault(rootNode, 200) + 100;
            int totalHeight = (getTreeDepth(rootNode) * VERTICAL_GAP) + 100;

            return new Dimension(totalWidth, totalHeight);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (rootNode == null) return;

            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setFont(labelFont);

            FontMetrics fm = g2.getFontMetrics();
            Map<DefaultMutableTreeNode, Integer> subtreeWidths = new HashMap<>();
            calculateSubtreeWidths(rootNode, fm, subtreeWidths);

            // Start drawing from the horizontal center of the calculated content space
            int startX = getPreferredSize().width / 2;
            int startY = 50;

            drawTreeRecursive(g2, rootNode, startX, startY, fm, subtreeWidths);
        }

        private void drawTreeRecursive(Graphics2D g2, DefaultMutableTreeNode node, int x, int y,
                                       FontMetrics fm, Map<DefaultMutableTreeNode, Integer> subtreeWidths) {
            if (node == null) return;

            String label = node.getUserObject().toString();
            int nodeWidth = fm.stringWidth(label) + NODE_PADDING_X;
            int nodeHeight = fm.getHeight() + NODE_PADDING_Y;

            int childCount = node.getChildCount();
            if (childCount > 0) {
                // Precompute the total horizontal space required for all siblings combined
                int totalChildrenWidth = 0;
                for (int i = 0; i < childCount; i++) {
                    DefaultMutableTreeNode child = (DefaultMutableTreeNode) node.getChildAt(i);
                    totalChildrenWidth += subtreeWidths.getOrDefault(child, HORIZONTAL_GAP_MIN);
                }

                // Center children relative to the current parent position
                int currentChildX = x - totalChildrenWidth / 2;
                int childY = y + VERTICAL_GAP;

                for (int i = 0; i < childCount; i++) {
                    DefaultMutableTreeNode child = (DefaultMutableTreeNode) node.getChildAt(i);
                    int childSubtreeWidth = subtreeWidths.getOrDefault(child, HORIZONTAL_GAP_MIN);

                    // Compute the precise coordinate for the child node
                    int childTargetX = currentChildX + childSubtreeWidth / 2;

                    String childLabel = child.getUserObject().toString();
                    int childWidth = fm.stringWidth(childLabel) + NODE_PADDING_X;
                    int childHeight = fm.getHeight() + NODE_PADDING_Y;

                    // Draw connecting line from bottom edge of parent to top edge of child
                    g2.setColor(new Color(90, 90, 90));
                    g2.setStroke(new BasicStroke(2));
                    g2.drawLine(x, y + nodeHeight / 2, childTargetX, childY - childHeight / 2);

                    // Recursive call to draw subtree branches
                    drawTreeRecursive(g2, child, childTargetX, childY, fm, subtreeWidths);

                    // Move cursor right for the next child node allocation
                    currentChildX += childSubtreeWidth;
                }
            }

            // Draw Node Background (Rounded Rectangle adapting to label width)
            g2.setColor(BACKGROUND);
            g2.fillRoundRect(x - nodeWidth / 2, y - nodeHeight / 2, nodeWidth, nodeHeight, ARC_SIZE, ARC_SIZE);

            // Draw Node Border with corporate Miku color
            g2.setColor(MIKU);
            g2.setStroke(new BasicStroke(2));
            g2.drawRoundRect(x - nodeWidth / 2, y - nodeHeight / 2, nodeWidth, nodeHeight, ARC_SIZE, ARC_SIZE);

            // Draw Text Label centered perfectly inside the rounded bounds
            g2.setColor(TEXT);
            int textX = x - fm.stringWidth(label) / 2;
            int textY = y + (fm.getAscent() - fm.getDescent()) / 2;
            g2.drawString(label, textX, textY);
        }

        /**
         * Post-order traversal to calculate required horizontal space for each subtree
         * preventing overlap errors on dense AST structures.
         */
        private int calculateSubtreeWidths(DefaultMutableTreeNode node, FontMetrics fm,
                                           Map<DefaultMutableTreeNode, Integer> subtreeWidths) {
            if (node == null) return 0;

            String label = node.getUserObject().toString();
            int selfWidth = (fm != null ? fm.stringWidth(label) : 50) + NODE_PADDING_X + HORIZONTAL_GAP_MIN;

            int childCount = node.getChildCount();
            if (childCount == 0) {
                subtreeWidths.put(node, selfWidth);
                return selfWidth;
            }

            int childrenTotalWidth = 0;
            for (int i = 0; i < childCount; i++) {
                DefaultMutableTreeNode child = (DefaultMutableTreeNode) node.getChildAt(i);
                childrenTotalWidth += calculateSubtreeWidths(child, fm, subtreeWidths);
            }

            // A node's width space is the maximum between its own text boundaries or its children's scale
            int finalWidth = Math.max(selfWidth, childrenTotalWidth);
            subtreeWidths.put(node, finalWidth);
            return finalWidth;
        }

        private int getTreeDepth(DefaultMutableTreeNode node) {
            if (node == null) return 0;
            int maxDepth = 0;
            for (int i = 0; i < node.getChildCount(); i++) {
                maxDepth = Math.max(maxDepth, getTreeDepth((DefaultMutableTreeNode) node.getChildAt(i)));
            }
            return maxDepth + 1;
        }
    }
}
