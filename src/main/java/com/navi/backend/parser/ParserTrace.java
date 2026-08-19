package com.navi.backend.parser;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class ParserTrace {
    private final List<ParserState> states = new ArrayList<>();

    public void addState(ParserOperation operation, String symbol, List<ParserStackItem> stack, String log) {
        String completeLog = log;
        if (!states.isEmpty()) {
            completeLog = states.get(states.size() - 1).log() + System.lineSeparator() + log;
        }

        states.add(new ParserState(states.size() + 1, operation, symbol, List.copyOf(stack), completeLog));
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