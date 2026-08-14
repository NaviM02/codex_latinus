package com.navi.ui.console;

import javax.swing.*;
import java.awt.*;

public class ConsolePanel extends JPanel {

    private static final Color CONSOLE_BACKGROUND = new Color(20, 20, 20);
    private static final Color MIKU_LIGHT = new Color(161, 244, 240);
    private static final Color MIKU = new Color(57, 197, 187);

    private final JTextArea textArea;

    public ConsolePanel() {
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        textArea.setBackground(CONSOLE_BACKGROUND);
        textArea.setForeground(MIKU_LIGHT);
        textArea.setCaretColor(MIKU);
        textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void setText(String text) {
        textArea.setText(text);
    }

    public void append(String text) {
        textArea.append(text);
    }

    public void clear() {
        textArea.setText("");
    }
}