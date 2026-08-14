package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class BreakStatement extends Statement {
    @Override
    public List<? extends AstNode> getChildren() {
        return List.of();
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("interrumpe"));
        sb.append(";\n");
    }
}
