package com.navi.ui.parser;

import com.navi.backend.parser.ParserStackItem;
import com.navi.backend.parser.ParserStackItemType;
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
    private static final Color MIKU_BACKGROUND = new Color(40, 56, 56);
    private static final Color MIKU_BUTTON_HOVER = new Color(47, 156, 149);

    private static final Color LUKA = new Color(255, 179, 222);
    private static final Color LUKA_BORDER = new Color(192, 163, 110);
    private static final Color LUKA_BACKGROUND = new Color(52, 47, 46);
    private static final Color LUKA_HOVER = new Color(186, 126, 160);

    private ParserTrace parserTrace;
    private int currentTraceState;

    // GUI UI Components
    private final JPanel stackPanel;
    private final JLabel stackStateLabel;
    private final JLabel stackOperationLabel;
    private final JLabel stackSymbolLabel;
    private final JTextArea stackLogArea;

    public ParserTracePanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel headerPanel = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("Pila de llamadas del parser");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setForeground(MIKU);

        stackStateLabel = new JLabel("Estado 0 / 0");
        stackStateLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        stackStateLabel.setForeground(MIKU);

        headerPanel.add(titleLabel, BorderLayout.WEST);
        headerPanel.add(stackStateLabel, BorderLayout.EAST);
        add(headerPanel, BorderLayout.NORTH);

        stackPanel = new JPanel();
        stackPanel.setLayout(new BoxLayout(stackPanel, BoxLayout.Y_AXIS));
        stackPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        JScrollPane stackScrollPane = new JScrollPane(stackPanel);
        stackScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        stackScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        stackScrollPane.getVerticalScrollBar().setUnitIncrement(20);
        stackScrollPane.getVerticalScrollBar().setBlockIncrement(130);

        JPanel detailsPanel = new JPanel(new BorderLayout(10, 10));

        JPanel metadataPanel = new JPanel();
        metadataPanel.setLayout(new BoxLayout(metadataPanel, BoxLayout.Y_AXIS));
        metadataPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        stackOperationLabel = new JLabel("Operación: -");
        stackOperationLabel.setFont(new Font("Arial", Font.BOLD, 13));
        stackOperationLabel.setForeground(MIKU);

        stackSymbolLabel = new JLabel("Símbolo: -");
        stackSymbolLabel.setFont(new Font("Arial", Font.BOLD, 13));
        stackSymbolLabel.setForeground(MIKU);

        metadataPanel.add(stackOperationLabel);
        metadataPanel.add(Box.createVerticalStrut(8));
        metadataPanel.add(stackSymbolLabel);
        detailsPanel.add(metadataPanel, BorderLayout.NORTH);

        stackLogArea = new JTextArea();
        stackLogArea.setEditable(false);
        stackLogArea.setLineWrap(true);
        stackLogArea.setWrapStyleWord(true);
        stackLogArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        stackLogArea.setForeground(MIKU_LIGHT);
        stackLogArea.setCaretColor(MIKU);

        JScrollPane logScrollPane = new JScrollPane(stackLogArea);
        detailsPanel.add(logScrollPane, BorderLayout.CENTER);
        JPanel navigationPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 5));
        JButton previousButton = createNavigationButton("◀ Anterior", true);
        JButton nextButton = createNavigationButton("Siguiente ▶", false);

        previousButton.addActionListener(e -> showPreviousState());
        nextButton.addActionListener(e -> showNextState());

        navigationPanel.add(previousButton);
        navigationPanel.add(nextButton);
        detailsPanel.add(navigationPanel, BorderLayout.SOUTH);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, stackScrollPane, detailsPanel);
        splitPane.setDividerLocation(300);
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
        stackPanel.removeAll();

        List<ParserStackItem> stack = state.stack();

        // Render from top to bottom.
        for (int i = stack.size() - 1; i >= 0; i--) {
            ParserStackItem item = stack.get(i);
            JLabel stackItem = createStackItem(item);
            stackPanel.add(stackItem);

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

    private JLabel createStackItem(ParserStackItem item) {
        boolean isToken = item.type() == ParserStackItemType.TOKEN;
        Color foreground = isToken ? LUKA : MIKU;
        Color background = isToken ? LUKA_BACKGROUND : MIKU_BACKGROUND;
        Color border = isToken ? LUKA_BORDER : MIKU_BORDER;

        JLabel label = new JLabel(" " + item.symbol() + " ");

        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        label.setOpaque(true);
        label.setBackground(background);
        label.setForeground(foreground);
        label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));

        label.setBorder(BorderFactory.createCompoundBorder(new LineBorder(border, 1), new EmptyBorder(6, 10, 6, 10)));

        return label;
    }

    private JButton createNavigationButton(String text, boolean luka) {
        JButton button = new JButton(text);
        if (luka) {
            button.setBackground(LUKA_BACKGROUND);
            button.setForeground(LUKA);
            button.setBorder(BorderFactory.createLineBorder(LUKA_BORDER, 2));
        } else {
            button.setBackground(MIKU_BACKGROUND);
            button.setForeground(MIKU_LIGHT);
            button.setBorder(BorderFactory.createLineBorder(MIKU_BORDER, 2));
        }

        button.setFont(new Font("Arial", Font.BOLD, 13));
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Color normalBackground = button.getBackground();
        Color hoverBackground = luka ? LUKA_HOVER : MIKU_BUTTON_HOVER;

        button.addMouseListener(
            new java.awt.event.MouseAdapter() {

                @Override
                public void mouseEntered(java.awt.event.MouseEvent e) {
                    button.setBackground(hoverBackground);
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent e) {
                    button.setBackground(normalBackground);
                }
            }
        );

        return button;
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