package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.declarations.Declaration;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class GlobalVariableSection extends AstNode {
    private List<Declaration> declarations;

    @Override
    public List<? extends AstNode> getChildren() {
        return declarations;
    }

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
