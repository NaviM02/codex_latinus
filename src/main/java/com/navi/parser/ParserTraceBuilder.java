package com.navi.parser;

import com.navi.ast.lexer_parser.LatinParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParserTraceBuilder {

    public ParserTrace build(LatinParser.ProgramContext tree) {
        ParserTraceListener listener = new ParserTraceListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        return listener.getTrace();
    }

}