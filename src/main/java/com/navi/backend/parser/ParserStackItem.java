package com.navi.backend.parser;

public record ParserStackItem(
        String symbol,
        ParserStackItemType type
) {
}