package com.navi.parser;

public record SyntaxError(int line, int column, String message) {
    @Override
    public String toString() {
        return "Line " + line + ":" + column + " - " + message;
    }
}