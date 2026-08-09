package com.navi;

import com.navi.ast.global.Program;
import com.navi.ast.lexer_parser.LatinLexer;
import com.navi.ast.lexer_parser.LatinParser;
import com.navi.ast.visitors.ProgramVisitor;
import com.navi.semantic.*;
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
                esto cifrado : falsus;
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
                } finis ;
                
                >> "Tu poder es: " >> calcularPoder(fuerza);
                >> "La puerta esta cifrada?" >> cifrado ;
                
                FINIS;

                
                """;

        CharStream input = CharStreams.fromString(source);

        LatinLexer lexer = new LatinLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LatinParser parser = new LatinParser(tokens);

        LatinParser.ProgramContext tree = parser.program();

        Program program = (Program) new ProgramVisitor().visit(tree);
        SymbolTable symbolTable = new SymbolTable();
        SymbolTableBuilder symbolTableBuilder = new SymbolTableBuilder(symbolTable);
        symbolTableBuilder.build(program);

        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(symbolTable);

        semanticAnalyzer.analyze(program);

        System.out.println("=== AST GENERADO ===");
        System.out.println(program);

        System.out.println("=== SEMANTIC ANALYSIS ===");
        System.out.println("No semantic errors found.");
    }
}