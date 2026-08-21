package com.navi.backend.parser.errors;

import lombok.Getter;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

import java.util.ArrayList;
import java.util.List;

@Getter
public class LexicalErrorListener extends BaseErrorListener {
    private final List<LexicalError> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errors.add(new LexicalError(line, charPositionInLine, msg));
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}