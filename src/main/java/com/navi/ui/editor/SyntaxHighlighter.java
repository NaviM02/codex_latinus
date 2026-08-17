package com.navi.ui.editor;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyntaxHighlighter {

    private static final Color TEXT = new Color(224, 224, 224);

    private static final Color KEYWORD = new Color(198, 120, 221);
    private static final Color TYPE = new Color(86, 156, 214);
    private static final Color BOOLEAN = new Color(198, 120, 221);
    private static final Color NUMBER = new Color(181, 206, 168);
    private static final Color STRING = new Color(206, 145, 120);
    private static final Color OPERATOR = new Color(212, 212, 212);

    private static final Color COMMENT = new Color(100, 100, 100);

    private static final Set<String> KEYWORDS = Set.of(
            // Sections
            "VARIABILES",
            "MUNERA",
            "MAIOR",
            // Keywords
            "structura",
            "finis",
            "esto",
            "series",
            "actio",
            "ratio",
            "si",
            "aliter",
            "dum",
            "facere",
            "per",
            "reddere",
            "perge",
            "interrumpe",
            // Program keyword
            "FINIS",
            // print and read
            "<<", ">>"
    );

    private static final Set<String> TYPES = Set.of(
            "numerus",
            "decimalis",
            "textum",
            "littera",
            "bool"
    );

    private static final Set<String> BOOLEANS = Set.of(
            "verum",
            "falsus"
    );

    private static final Pattern TOKEN_PATTERN = Pattern.compile(
        "##[\\s\\S]*?##" +
                "|\"(?:\\\\.|[^\"\\\\])*\"" +
                "|'(?:\\\\.|[^'\\\\])*'" +
                "|\\b\\d+(?:\\.\\d+)?\\b" +
                "|==|!=|<=|>=|&&|\\|\\||\\+\\+|--|[+\\-*/%=<>!]" +
                "|\\b[A-Za-z_][A-Za-z0-9_]*\\b"
    );

    private final JTextPane editor;
    private final StyledDocument document;

    private final AttributeSet normalStyle;
    private final AttributeSet keywordStyle;
    private final AttributeSet typeStyle;
    private final AttributeSet booleanStyle;
    private final AttributeSet numberStyle;
    private final AttributeSet stringStyle;
    private final AttributeSet charStyle;
    private final AttributeSet operatorStyle;
    private final AttributeSet commentStyle;

    public SyntaxHighlighter(JTextPane editor) {
        this.editor = editor;
        this.document = editor.getStyledDocument();

        normalStyle = createStyle(TEXT);
        keywordStyle = createStyle(KEYWORD);
        typeStyle = createStyle(TYPE);
        booleanStyle = createStyle(BOOLEAN);
        numberStyle = createStyle(NUMBER);
        stringStyle = createStyle(STRING);
        charStyle = createStyle(STRING);
        operatorStyle = createStyle(OPERATOR);
        commentStyle = createStyle(COMMENT);
    }

    private AttributeSet createStyle(Color color) {
        SimpleAttributeSet style = new SimpleAttributeSet();
        StyleConstants.setForeground(style, color);
        return style;
    }

    public void highlight() {
        SwingUtilities.invokeLater(() -> {
            String text = editor.getText();
            document.setCharacterAttributes(0, text.length(), normalStyle, true);
            Matcher matcher = TOKEN_PATTERN.matcher(text);

            while (matcher.find()) {
                String token = matcher.group();
                AttributeSet style = getStyle(token);
                document.setCharacterAttributes(matcher.start(), matcher.end() - matcher.start(), style, true);
            }
        });
    }

    private AttributeSet getStyle(String token) {
        if (token.startsWith("##")) {
            return commentStyle;
        }

        if (token.startsWith("\"")) {
            return stringStyle;
        }

        if (token.startsWith("'")) {
            return charStyle;
        }

        if (token.matches("\\d+(?:\\.\\d+)?")) {
            return numberStyle;
        }

        if (isOperator(token)) {
            return operatorStyle;
        }

        if (KEYWORDS.contains(token)) {
            return keywordStyle;
        }

        if (TYPES.contains(token)) {
            return typeStyle;
        }

        if (BOOLEANS.contains(token)) {
            return booleanStyle;
        }

        return normalStyle;
    }

    private boolean isOperator(String token) {
        return switch (token) {
            case "==", "!=", "<=", ">=", "&&", "||", "++", "--", "+", "-", "*", "/", "=", "<", ">", "!", "non" -> true;
            default -> false;
        };
    }
}