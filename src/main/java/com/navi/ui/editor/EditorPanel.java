package com.navi.ui.editor;

import com.navi.ui.utils.NumeroLinea;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretListener;
import java.awt.*;

public class EditorPanel extends JPanel {

    private static final Color EDITOR_BACKGROUND = new Color(25, 25, 25);
    private static final Color TEXT = new Color(224, 224, 224);
    private static final Color MIKU = new Color(57, 197, 187);

    private final JTextArea editor;
    private final JScrollPane scrollPane;

    public EditorPanel() {
        setLayout(new BorderLayout());

        editor = new JTextArea();
        scrollPane = new JScrollPane(editor);

        JLabel title = new JLabel("  Código fuente");
        title.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel extension = new JLabel(".lat  ");

        JPanel header = new JPanel(new BorderLayout());
        header.setBorder(new EmptyBorder(4, 4, 4, 4));

        header.add(title, BorderLayout.WEST);
        header.add(extension, BorderLayout.EAST);

        add(header, BorderLayout.NORTH);

        scrollPane.setRowHeaderView(new NumeroLinea(editor));

        add(scrollPane, BorderLayout.CENTER);

        style();
    }

    private void style() {
        editor.setBackground(EDITOR_BACKGROUND);
        editor.setForeground(TEXT);
        editor.setCaretColor(MIKU);
        editor.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
        editor.setTabSize(4);
    }

    public JTextArea getEditor() {
        return editor;
    }

    public String getText() {
        return editor.getText();
    }

    public void setText(String text) {
        editor.setText(text);
    }

    public void addCaretListener(CaretListener listener) {
        editor.addCaretListener(listener);
    }
}