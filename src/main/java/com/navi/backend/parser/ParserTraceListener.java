package com.navi.backend.parser;

import com.navi.backend.lexer_parser.PigLatinBaseListener;
import com.navi.backend.lexer_parser.PigLatinParser;
import lombok.Getter;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class ParserTraceListener extends PigLatinBaseListener {
    @Getter
    private final ParserTrace trace = new ParserTrace();
    private final Deque<ParserStackItem> stack = new ArrayDeque<>();
    private final Deque<Integer> ruleStackSizes = new ArrayDeque<>();

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        String ruleName = getRuleName(ctx);
        ruleStackSizes.push(stack.size());

        ParserStackItem item = new ParserStackItem(ruleName, ParserStackItemType.PRODUCTION);
        stack.addLast(item);
        trace.addState(ParserOperation.ENTER_RULE, ruleName, new ArrayList<>(stack), "enter " + ruleName);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        String tokenText = node.getText();
        ParserStackItem item = new ParserStackItem(tokenText, ParserStackItemType.TOKEN);
        stack.addLast(item);
        trace.addState(ParserOperation.SHIFT, tokenText, new ArrayList<>(stack), "shift " + tokenText);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        String ruleName = getRuleName(ctx);
        int initialSize = ruleStackSizes.pop();

        while (stack.size() > initialSize) {
            stack.removeLast();
        }

        ParserStackItem item = new ParserStackItem(ruleName, ParserStackItemType.PRODUCTION);
        stack.addLast(item);

        if (ctx instanceof PigLatinParser.ProgramContext) {
            trace.addState(ParserOperation.ACCEPT, "EOF", new ArrayList<>(stack), "accept");
            return;
        }

        trace.addState(ParserOperation.REDUCE, ruleName, new ArrayList<>(stack), "reduce " + ruleName);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        String tokenText = node.getText();

        ParserStackItem item = new ParserStackItem(tokenText, ParserStackItemType.TOKEN);
        stack.addLast(item);
        trace.addState(ParserOperation.SHIFT, tokenText, new ArrayList<>(stack), "error token " + tokenText);
    }

    private String getRuleName(ParserRuleContext ctx) {
        return PigLatinParser.ruleNames[ctx.getRuleIndex()];
    }
}