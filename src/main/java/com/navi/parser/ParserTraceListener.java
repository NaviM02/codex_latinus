package com.navi.parser;

import com.navi.ast.lexer_parser.LatinBaseListener;
import com.navi.ast.lexer_parser.LatinParser;
import lombok.Getter;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class ParserTraceListener extends LatinBaseListener {
    @Getter
    private final ParserTrace trace = new ParserTrace();
    private final Deque<String> stack = new ArrayDeque<>();

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        String ruleName = getRuleName(ctx);
        stack.addLast(ruleName);
        trace.addState(ParserOperation.ENTER_RULE, ruleName, new ArrayList<>(stack), "enter " + ruleName);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        String tokenText = node.getText();
        ArrayList<String> stackSnapshot = new ArrayList<>(stack);

        stackSnapshot.add(tokenText);
        trace.addState(ParserOperation.SHIFT, tokenText, stackSnapshot, "shift " + tokenText);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        String ruleName = getRuleName(ctx);

        if (ctx instanceof LatinParser.ProgramContext) {
            trace.addState(ParserOperation.ACCEPT, "EOF", new ArrayList<>(stack), "accept");
            stack.removeLast();
            return;
        }

        trace.addState(ParserOperation.REDUCE, ruleName, new ArrayList<>(stack), "reduce " + ruleName);
        stack.removeLast();
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        String tokenText = node.getText();
        ArrayList<String> stackSnapshot = new ArrayList<>(stack);
        stackSnapshot.add(tokenText);
        trace.addState(ParserOperation.SHIFT, tokenText, stackSnapshot, "error token " + tokenText);
    }

    private String getRuleName(ParserRuleContext ctx) {
        return LatinParser.ruleNames[ctx.getRuleIndex()];
    }
}