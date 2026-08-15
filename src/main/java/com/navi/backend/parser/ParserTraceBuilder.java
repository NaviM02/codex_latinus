package com.navi.backend.parser;

import com.navi.backend.lexer_parser.PigLatinParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParserTraceBuilder {

    public ParserTrace build(PigLatinParser.ProgramContext tree) {
        ParserTraceListener listener = new ParserTraceListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        return listener.getTrace();
    }

}