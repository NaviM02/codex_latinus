package com.navi.backend.parser;

import java.util.List;

public record ParserState(int step, ParserOperation operation, String symbol, List<String> stack, String log) {
}