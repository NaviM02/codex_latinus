package com.navi.backend.pig_latin;

public record PigLatinToken(int start, int end, PigLatinTokenType type) {
    public int length() {
        return end - start;
    }
}