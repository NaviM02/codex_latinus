package com.navi.backend.parser.errors;

public record SyntaxError(int line, int column, String message) {
    @Override
    public String toString() {
        return "Line " + line + ":" + column + " - " + message;
    }
}