package com.navi.backend.pig_latin;

import java.util.ArrayList;
import java.util.List;

public class PigLatinWriter {
    private final StringBuilder text = new StringBuilder();
    private final List<PigLatinToken> tokens = new ArrayList<>();

    public void append(String value) {
        text.append(value);
    }

    public void appendKeyword(String value) {
        appendToken(value, PigLatinTokenType.KEYWORD);
    }

    public void appendType(String value) {
        appendToken(value, PigLatinTokenType.TYPE);
    }

    public void appendIdentifier(String value) {
        appendToken(value, PigLatinTokenType.IDENTIFIER);
    }

    public void appendNumber(String value) {
        appendToken(value, PigLatinTokenType.NUMBER);
    }

    public void appendDecimal(String value) {
        appendToken(value, PigLatinTokenType.DECIMAL);
    }

    public void appendString(String value) {
        appendToken(value, PigLatinTokenType.STRING);
    }

    public void appendChar(String value) {
        appendToken(value, PigLatinTokenType.CHAR);
    }

    public void appendBoolean(String value) {
        appendToken(value, PigLatinTokenType.BOOLEAN);
    }

    public void appendOperator(String value) {
        appendToken(value, PigLatinTokenType.OPERATOR);
    }

    public void appendSymbol(String value) {
        appendToken(value, PigLatinTokenType.SYMBOL);
    }

    private void appendToken(String value, PigLatinTokenType type) {
        int start = text.length();
        text.append(value);
        int end = text.length();
        tokens.add(new PigLatinToken(start, end, type));
    }

    public String getText() {
        return text.toString();
    }

    public List<PigLatinToken> getTokens() {
        return List.copyOf(tokens);
    }
}