package com.navi.backend.compiler;

import com.navi.backend.ast.global.Program;
import com.navi.backend.parser.ParserTrace;
import com.navi.backend.semantic.SymbolTable;
import lombok.Getter;

import java.util.List;

@Getter
public class CompilationResult {
    private final boolean successful;
    private final Program program;
    private final SymbolTable symbolTable;
    private final ParserTrace parserTrace;
    private final String pigLatin;
    private final List<String> syntaxErrors;
    private final List<String> semanticErrors;

    private CompilationResult(
            boolean successful, Program program, SymbolTable symbolTable, ParserTrace parserTrace,
            String pigLatin, List<String> syntaxErrors, List<String> semanticErrors
    ) {
        this.successful = successful;
        this.program = program;
        this.symbolTable = symbolTable;
        this.parserTrace = parserTrace;
        this.pigLatin = pigLatin;
        this.syntaxErrors = syntaxErrors;
        this.semanticErrors = semanticErrors;
    }

    public static CompilationResult success(Program program, SymbolTable symbolTable, ParserTrace parserTrace, String pigLatin) {
        return new CompilationResult(true, program, symbolTable, parserTrace, pigLatin, List.of(), List.of());
    }

    public static CompilationResult syntaxError(List<String> errors) {
        return new CompilationResult(false, null, null, null, null, errors, List.of());
    }

    public static CompilationResult semanticError(Program program, SymbolTable symbolTable, List<String> errors) {
        return new CompilationResult(false, program, symbolTable, null, null, List.of(), errors);
    }

}