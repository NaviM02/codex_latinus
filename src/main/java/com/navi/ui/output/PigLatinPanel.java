package com.navi.ui.output;

import com.navi.backend.pig_latin.PigLatinToken;
import com.navi.backend.pig_latin.PigLatinTokenType;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.util.List;

public class PigLatinPanel extends JPanel {

    private static final Color BACKGROUND = new Color(35, 35, 35);
    private static final Color TEXT = new Color(224, 224, 224);

    private final JTextPane textPane;

    public PigLatinPanel() {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(5, 5, 5, 5));

        textPane = new JTextPane();

        textPane.setEditable(false);
        textPane.setBackground(BACKGROUND);
        textPane.setForeground(TEXT);
        textPane.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));

        add(new JScrollPane(textPane), BorderLayout.CENTER);
    }

    public void setText(String text) {
        textPane.setText(text);
    }

    public void setPigLatin(String text, List<PigLatinToken> tokens) {
        StyledDocument document = textPane.getStyledDocument();

        try {
            document.remove(0, document.getLength());
            document.insertString(0, text, null);

            for (PigLatinToken token : tokens) {
                SimpleAttributeSet attributes = new SimpleAttributeSet();
                StyleConstants.setForeground(attributes, getColor(token.type()));
                document.setCharacterAttributes(token.start(), token.length(), attributes, false);
            }

        } catch (BadLocationException e) {
            throw new IllegalStateException("Could not render PigLatin output.", e);
        }
    }

    public String getText() {
        return textPane.getText();
    }

    public void clear() {
        textPane.setText("");
    }

    private Color getColor(PigLatinTokenType type) {
        return switch (type) {
            case KEYWORD, BOOLEAN -> new Color(198, 120, 221);
            case TYPE -> new Color(86, 156, 214);
            case IDENTIFIER -> new Color(223, 67, 112);
            case NUMBER, DECIMAL -> new Color(181, 206, 168);
            case STRING, CHAR -> new Color(206, 145, 120);
            case OPERATOR, SYMBOL -> new Color(212, 212, 212);
        };
    }
}