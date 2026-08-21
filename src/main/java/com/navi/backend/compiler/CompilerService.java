package com.navi.backend.compiler;

import com.navi.backend.ast.global.Program;
import com.navi.backend.lexer_parser.PigLatinLexer;
import com.navi.backend.lexer_parser.PigLatinParser;
import com.navi.backend.ast.visitors.ProgramVisitor;
import com.navi.backend.parser.ParserTrace;
import com.navi.backend.parser.ParserTraceBuilder;
import com.navi.backend.parser.errors.LexicalError;
import com.navi.backend.parser.errors.LexicalErrorListener;
import com.navi.backend.parser.errors.SyntaxError;
import com.navi.backend.parser.errors.SyntaxErrorListener;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.semantic.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class CompilerService {

    public CompilationResult compile(String source) {
        LexicalErrorListener lexicalErrorListener = new LexicalErrorListener();
        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();

        CharStream input = CharStreams.fromString(source);

        PigLatinLexer lexer = new PigLatinLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexicalErrorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PigLatinParser parser = new PigLatinParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(syntaxErrorListener);

        PigLatinParser.ProgramContext tree = parser.program();

        List<String> lexicalErrors = lexicalErrorListener.getErrors().stream().map(LexicalError::toString).toList();
        List<String> syntaxErrors = syntaxErrorListener.getErrors().stream().map(SyntaxError::toString).toList();

        if (!lexicalErrors.isEmpty() || !syntaxErrors.isEmpty()) {
            return CompilationResult.parserError(lexicalErrors, syntaxErrors);
        }

        Program program = (Program) new ProgramVisitor().visit(tree);

        SymbolTable symbolTable = new SymbolTable();
        SymbolTableBuilderVisitor symbolTableBuilder = new SymbolTableBuilderVisitor(symbolTable);
        symbolTableBuilder.build(program);

        SemanticAnalyzerVisitor semanticAnalyzer = new SemanticAnalyzerVisitor(symbolTable);
        semanticAnalyzer.analyze(program);

        if (semanticAnalyzer.hasErrors()) {
            return CompilationResult.semanticError(program, symbolTable, semanticAnalyzer.getErrors());
        }

        PigLatinWriter pigLatinWriter = new PigLatinWriter();
        program.toPigLatin(pigLatinWriter, 0);

        ParserTraceBuilder traceBuilder = new ParserTraceBuilder();
        ParserTrace trace = traceBuilder.build(tree);

        return CompilationResult.success(program, symbolTable, trace, pigLatinWriter.getText(), pigLatinWriter.getTokens());
    }
}