package com.navi.backend.compiler;

import com.navi.backend.ast.global.Program;
import com.navi.backend.ast.lexer_parser.PigLatinLexer;
import com.navi.backend.ast.lexer_parser.PigLatinParser;
import com.navi.backend.ast.visitors.ProgramVisitor;
import com.navi.backend.parser.ParserTrace;
import com.navi.backend.parser.ParserTraceBuilder;
import com.navi.backend.parser.SyntaxError;
import com.navi.backend.parser.SyntaxErrorListener;
import com.navi.backend.semantic.SemanticAnalyzer;
import com.navi.backend.semantic.SymbolTable;
import com.navi.backend.semantic.SymbolTableBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class CompilerService {

    public CompilationResult compile(String source) {
        SyntaxErrorListener errorListener = new SyntaxErrorListener();

        CharStream input = CharStreams.fromString(source);

        PigLatinLexer lexer = new PigLatinLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PigLatinParser parser = new PigLatinParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        PigLatinParser.ProgramContext tree = parser.program();

        if (errorListener.hasErrors()) {
            List<String> errors = errorListener.getErrors().stream().map(SyntaxError::toString).toList();
            return CompilationResult.syntaxError(errors);
        }

        Program program = (Program) new ProgramVisitor().visit(tree);

        SymbolTable symbolTable = new SymbolTable();
        SymbolTableBuilder symbolTableBuilder = new SymbolTableBuilder(symbolTable);
        symbolTableBuilder.build(program);

        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(symbolTable);
        semanticAnalyzer.analyze(program);

        if (semanticAnalyzer.hasErrors()) {
            return CompilationResult.semanticError(program, symbolTable, semanticAnalyzer.getErrors());
        }

        StringBuilder pigLatin = new StringBuilder();
        program.toPigLatin(pigLatin, 0);

        ParserTraceBuilder traceBuilder = new ParserTraceBuilder();
        ParserTrace trace = traceBuilder.build(tree);

        return CompilationResult.success(program, symbolTable, trace, pigLatin.toString());
    }
}