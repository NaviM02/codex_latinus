package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.statements.*;
import com.navi.backend.ast.statements.*;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Program extends AstNode {
    private final GlobalVariableSection globalVariables;
    private final List<FunctionDeclaration> functions;
    private final List<Statement> mainStatements;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        if (globalVariables != null) {
            globalVariables.toPigLatin(sb, indent);
        }

        if (functions != null) {
            sb.append(PigLatinRules.translateSectionKeyword("MUNERA"));
            sb.append(">\n");
            for (FunctionDeclaration function : functions) {
                function.toPigLatin(sb, indent + 1);
            }
        }

        sb.append("\n");
        sb.append(PigLatinRules.translateSectionKeyword("MAIOR"));
        sb.append(">\n");
        for (Statement statement : mainStatements) {
            if (statement instanceof IfStatement || statement instanceof WhileStatement
                    || statement instanceof ForStatement || statement instanceof DoWhileStatement) {
                sb.append("\n");
            }
            statement.toPigLatin(sb, indent);
        }
    }
}
