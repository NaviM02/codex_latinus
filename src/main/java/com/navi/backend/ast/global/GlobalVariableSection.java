package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.declarations.Declaration;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
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
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendKeyword(PigLatinRules.translateSectionKeyword("VARIABILES"));
        writer.appendKeyword(">\n");

        for (Declaration declaration : declarations) {
            declaration.toPigLatin(writer, indent);
        }

        writer.append("\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
