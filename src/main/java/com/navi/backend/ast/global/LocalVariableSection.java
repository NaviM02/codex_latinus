package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.declarations.Declaration;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.Getter;

import java.util.List;

@Getter
public class LocalVariableSection extends AstNode {
    private final List<Declaration> declarations;

    public LocalVariableSection(int line, int column, List<Declaration> declarations) {
        super(line, column);
        this.declarations = declarations;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        return declarations;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        indent(writer, indent);
        writer.appendKeyword(PigLatinRules.translateSectionKeyword("VARIABILES"));
        writer.append("[\n");

        for (Declaration declaration : declarations) {
            indent(writer, indent + 1);
            declaration.toPigLatin(writer, indent + 1);
            writer.append("\n");
        }
        indent(writer, indent);
        writer.append("]\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
