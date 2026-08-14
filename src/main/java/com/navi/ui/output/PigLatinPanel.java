package com.navi.ui.output;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PigLatinPanel extends JPanel {

    private static final Color BACKGROUND = new Color(35, 35, 35);
    private static final Color TEXT = new Color(224, 224, 224);

    private final JTextArea textArea;

    public PigLatinPanel() {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(5, 5, 5, 5));

        textArea = new JTextArea();

        textArea.setEditable(false);
        textArea.setLineWrap(false);
        textArea.setBackground(BACKGROUND);
        textArea.setForeground(TEXT);
        textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void setText(String text) {
        textArea.setText(text);
    }

    public String getText() {
        return textArea.getText();
    }

    public void clear() {
        textArea.setText("");
    }
}