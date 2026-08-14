package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.declarations.Declaration;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class LocalVariableSection extends AstNode {
    private final List<Declaration> declarations;

    @Override
    public List<? extends AstNode> getChildren() {
        return declarations;
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        indent(sb, indent);
        sb.append(PigLatinRules.translateSectionKeyword("VARIABILES"));
        sb.append("[\n");

        for (Declaration declaration : declarations) {
            indent(sb, indent + 1);
            declaration.toPigLatin(sb, indent + 1);
        }
        indent(sb, indent);
        sb.append("]\n");
    }
}
