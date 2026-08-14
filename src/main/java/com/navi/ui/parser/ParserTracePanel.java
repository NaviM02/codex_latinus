package com.navi.ui.parser;

import com.navi.backend.parser.ParserState;
import com.navi.backend.parser.ParserTrace;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.List;

public class ParserTracePanel extends JPanel {

    // Style and theme colors
    private static final Color MIKU = new Color(57, 197, 187);
    private static final Color MIKU_LIGHT = new Color(161, 244, 240);
    private static final Color MIKU_BORDER = new Color(39, 111, 107);
    private static final Color STACK_ITEM_BACKGROUND = new Color(40, 56, 56);

    private ParserTrace parserTrace;
    private int currentTraceState;

    // GUI UI Components
    private final JPanel stackPanel;
    private final JLabel stackStateLabel;
    private final JLabel stackOperationLabel;
    private final JLabel stackSymbolLabel;
    private final JTextArea stackLogArea;

    public ParserTracePanel() {
        // Main layout uses BorderLayout to accommodate the split screen panel structure
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        // 1. Header Section Setup
        JPanel headerPanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel("Pila de llamadas del parser");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

        stackStateLabel = new JLabel("Estado 0 / 0");
        stackStateLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        headerPanel.add(titleLabel, BorderLayout.WEST);
        headerPanel.add(stackStateLabel, BorderLayout.EAST);
        add(headerPanel, BorderLayout.NORTH);

        // 2. Left Component: The Visual Parsing Stack Container
        stackPanel = new JPanel();
        stackPanel.setLayout(new BoxLayout(stackPanel, BoxLayout.Y_AXIS));
        stackPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        JScrollPane stackScrollPane = new JScrollPane(stackPanel);
        stackScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        stackScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        // 3. Right Component: Split details panel containing text metadata & user navigation
        JPanel detailsPanel = new JPanel(new BorderLayout(10, 10));

        // Metadata information segment (Operation and Symbol fields)
        JPanel metadataPanel = new JPanel();
        metadataPanel.setLayout(new BoxLayout(metadataPanel, BoxLayout.Y_AXIS));
        metadataPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        stackOperationLabel = new JLabel("Operación: -");
        stackOperationLabel.setFont(new Font("Arial", Font.BOLD, 13));
        stackSymbolLabel = new JLabel("Símbolo: -");
        stackSymbolLabel.setFont(new Font("Arial", Font.BOLD, 13));

        metadataPanel.add(stackOperationLabel);
        metadataPanel.add(Box.createVerticalStrut(8));
        metadataPanel.add(stackSymbolLabel);
        detailsPanel.add(metadataPanel, BorderLayout.NORTH);

        // Dynamic System Log Area for parser state inspection
        stackLogArea = new JTextArea();
        stackLogArea.setEditable(false);
        stackLogArea.setLineWrap(true);
        stackLogArea.setWrapStyleWord(true);
        stackLogArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

        JScrollPane logScrollPane = new JScrollPane(stackLogArea);
        detailsPanel.add(logScrollPane, BorderLayout.CENTER);

        // Navigation controls block (Action buttons)
        JPanel navigationPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 5));
        JButton previousButton = new JButton("◀ Anterior");
        JButton nextButton = new JButton("Siguiente ▶");

        previousButton.addActionListener(e -> showPreviousState());
        nextButton.addActionListener(e -> showNextState());

        navigationPanel.add(previousButton);
        navigationPanel.add(nextButton);
        detailsPanel.add(navigationPanel, BorderLayout.SOUTH);

        // 4. Split Layout Integrator (Merges Left and Right Views seamlessly)
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, stackScrollPane, detailsPanel);
        splitPane.setDividerLocation(300); // Set fixed starting pixel boundary allocation for the stack
        splitPane.setContinuousLayout(true);
        splitPane.setBorder(null);

        add(splitPane, BorderLayout.CENTER);
    }

    public void setParserTrace(ParserTrace parserTrace) {
        this.parserTrace = parserTrace;
        currentTraceState = 0;

        if (parserTrace == null || parserTrace.size() == 0) {
            clear();
            return;
        }

        showState(0);
    }

    private void showState(int index) {
        if (parserTrace == null || parserTrace.size() == 0) {
            clear();
            return;
        }

        index = Math.max(0, Math.min(index, parserTrace.size() - 1));
        currentTraceState = index;

        ParserState state = parserTrace.getState(index);

        stackStateLabel.setText("Estado " + state.step() + " / " + parserTrace.size());
        stackOperationLabel.setText("Operación: " + state.operation());
        stackSymbolLabel.setText("Símbolo: " + state.symbol());
        stackLogArea.setText(state.log());

        // Refresh UI stack execution stack frame content
        stackPanel.removeAll();

        List<String> stack = state.stack();

        // Render compilation stack from top to bottom
        for (int i = stack.size() - 1; i >= 0; i--) {
            JLabel stackItem = createStackItem(stack.get(i));
            stackPanel.add(stackItem);

            // Print the execution path arrow trace indicator pointing downwards
            if (i > 0) {
                JLabel arrowLabel = new JLabel("▼");
                arrowLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                arrowLabel.setForeground(MIKU);
                arrowLabel.setBorder(new EmptyBorder(4, 0, 4, 0));
                stackPanel.add(arrowLabel);
            }
        }

        stackPanel.revalidate();
        stackPanel.repaint();
    }

    private JLabel createStackItem(String symbol) {
        JLabel item = new JLabel(" " + symbol + " ");
        item.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Force Maximum horizontal alignment inside the BoxLayout structure
        item.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        item.setHorizontalAlignment(SwingConstants.CENTER);

        item.setOpaque(true);
        item.setBackground(STACK_ITEM_BACKGROUND);
        item.setForeground(MIKU_LIGHT);
        item.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
        item.setBorder(
            BorderFactory.createCompoundBorder(new LineBorder(MIKU_BORDER, 1), new EmptyBorder(6, 10, 6, 10))
        );

        return item;
    }

    private void showPreviousState() {
        if (currentTraceState > 0) {
            showState(currentTraceState - 1);
        }
    }

    private void showNextState() {
        if (parserTrace != null && currentTraceState < parserTrace.size() - 1) {
            showState(currentTraceState + 1);
        }
    }

    public void clear() {
        stackStateLabel.setText("Sin estados");
        stackOperationLabel.setText("Operación: -");
        stackSymbolLabel.setText("Símbolo: -");
        stackLogArea.setText("");
        stackPanel.removeAll();
        stackPanel.revalidate();
        stackPanel.repaint();
    }
}
