package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.statements.*;
import com.navi.backend.ast.statements.*;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Program extends AstNode {
    private final GlobalVariableSection globalVariables;
    private final List<FunctionDeclaration> functions;
    private final List<Statement> mainStatements;

    public Program(int line, int column, GlobalVariableSection globalVariables, List<FunctionDeclaration> functions, List<Statement> mainStatements) {
        super(line, column);
        this.globalVariables = globalVariables;
        this.functions = functions;
        this.mainStatements = mainStatements;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        List<AstNode> children = new ArrayList<>();

        if (globalVariables != null) {
            children.add(globalVariables);
        }

        if (functions != null) {
            children.addAll(functions);
        }

        if (mainStatements != null) {
            children.addAll(mainStatements);
        }

        return children;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        if (globalVariables != null) {
            globalVariables.toPigLatin(writer, indent);
        }

        if (functions != null) {
            writer.appendKeyword(PigLatinRules.translateSectionKeyword("MUNERA"));
            writer.appendKeyword(">\n");
            for (FunctionDeclaration function : functions) {
                function.toPigLatin(writer, indent + 1);
            }
        }

        writer.append("\n");
        writer.appendKeyword(PigLatinRules.translateSectionKeyword("MAIOR"));
        writer.appendKeyword(">\n");
        for (Statement statement : mainStatements) {
            if (statement instanceof IfStatement || statement instanceof WhileStatement
                    || statement instanceof ForStatement || statement instanceof DoWhileStatement) {
                writer.append("\n");
            }
            statement.toPigLatin(writer, indent);
        }
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
