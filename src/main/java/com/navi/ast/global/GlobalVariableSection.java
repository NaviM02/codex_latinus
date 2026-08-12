package com.navi.ast.global;

import com.navi.ast.AstNode;
import com.navi.ast.declarations.Declaration;
import com.navi.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class GlobalVariableSection extends AstNode {
    private List<Declaration> declarations;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateSectionKeyword("VARIABILES"));
        sb.append(">\n");

        for (Declaration declaration : declarations) {
            declaration.toPigLatin(sb, indent);
        }

        sb.append("\n");
    }
}
