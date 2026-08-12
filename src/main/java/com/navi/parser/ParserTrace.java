package com.navi.parser;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class ParserTrace {
    private final List<ParserState> states = new ArrayList<>();

    public void addState(ParserOperation operation, String symbol, List<String> stack, String log) {
        states.add(new ParserState(states.size() + 1, operation, symbol, List.copyOf(stack), log));
    }

    public List<ParserState> getStates() {
        return Collections.unmodifiableList(states);
    }

    public ParserState getState(int index) {
        return states.get(index);
    }

    public int size() {
        return states.size();
    }
}