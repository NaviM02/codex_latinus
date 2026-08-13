package com.navi;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
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
import com.navi.ui.Dashboard;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {

        String source = """
                ##
                   Sección opcional de variables, puede no existir
                   En esta sección solo se definen variables, arreglos
                   o estructuras globales
                ##
                VARIABILES>
                esto edad : numerus 20;
                esto cifrado : bool falsus;
                esto comandante : textum "Estudiante X";
                esto fuerza : numerus 10;
                esto poder : numerus 0;
                
                ##
                   Seccion de funciones, es opcional
                   En esta seccion solo se deben definir funciones
                ##
                MUNERA>
                // Definición de funcion con retorno
                ratio numerus calcularPoder(esto fuerza : numerus) {
                   VARIABILES[
                      esto total : numerus fuerza * 2;
                   ]
                   si (total == 1) {
                      total++;
                   } finis;
                   reddere total;
                } finis;
                
                ##
                   Seccion de funcion principal
                   Esta sección es obligatoria
                ##
                MAIOR>
                >> "Hola comandante!" ;
                >> "Ingresa tu nombre por favor" ;
                comandante <<
                >> "Bienvenido" >> comandante ;
                >> "Ingresa tu edad" ;
                edad <<\s
                
                si (edad >= 18) {
                   cifrado = verum;
                   fuerza = 12;
                   si (edad <= 30) {
                        cifrado = falsus;
                   } finis;
                } finis ;
                
                >> "Tu poder es: " >> calcularPoder(fuerza);
                >> "La puerta esta cifrada?" >> cifrado ;
                
                FINIS;

                
                """;

        CharStream input = CharStreams.fromString(source);

        SyntaxErrorListener errorListener = new SyntaxErrorListener();

        PigLatinLexer lexer = new PigLatinLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PigLatinParser parser = new PigLatinParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        PigLatinParser.ProgramContext tree = parser.program();

        if (errorListener.hasErrors()) {
            System.out.println("====== SYNTAX ERRORS ======");

            for (SyntaxError error : errorListener.getErrors()) {
                System.out.println(error);
            }

            System.out.println("\nProgram contains syntax errors. AST generation skipped.");

            return;
        }

        Program program = (Program) new ProgramVisitor().visit(tree);
        SymbolTable symbolTable = new SymbolTable();
        SymbolTableBuilder symbolTableBuilder = new SymbolTableBuilder(symbolTable);
        symbolTableBuilder.build(program);

        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(symbolTable);

        semanticAnalyzer.analyze(program);

        if (semanticAnalyzer.hasErrors()) {
            System.out.println("=== SEMANTIC ERRORS ===");

            for (String error : semanticAnalyzer.getErrors()) {
                System.out.println("ERROR: " + error);
            }
            return;
        }

        System.out.println("=== AST GENERADO ===");
        System.out.println(program);

        System.out.println("=== SEMANTIC ANALYSIS ===");
        System.out.println("No semantic errors found.");

        if (!semanticAnalyzer.hasErrors()) {
            StringBuilder sb = new StringBuilder();

            program.toPigLatin(sb, 0);

            System.out.println("====== PIG LATIN TRANSLATION ======");
            System.out.println(sb);
        }

        ParserTraceBuilder traceBuilder = new ParserTraceBuilder();
        ParserTrace trace = traceBuilder.build(tree);

       /* System.out.println();
        System.out.println("====== PARSER TRACE ======");

        for (ParserState state : trace.getStates()) {
            System.out.println();
            System.out.println("========== STATE " + state.step() + " ==========");
            System.out.println("Operation: " + state.operation());
            System.out.println("Symbol: " + state.symbol());
            System.out.println("Stack:");
            for (String symbol : state.stack()) {
                System.out.println("  " + symbol);
            }
            System.out.println("Log: " + state.log());
        }*/

        FlatMaterialDarkerIJTheme.setup();
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
    }

}