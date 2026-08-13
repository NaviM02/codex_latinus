package com.navi.backend.ast.statements;

import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BreakStatement extends Statement {
    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("interrumpe"));
        sb.append(";\n");
    }
}
