package com.navi.backend.ast.declarations;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class StructDeclaration extends Declaration {
    private String name;
    private List<StructField> fields;

    @Override
    public List<? extends AstNode> getChildren() {
        return fields;
    }

    @Override
    public String getNodeLabel() {
        return "StructDeclaration: " + name;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendKeyword(PigLatinRules.translateKeyword("estructura"));
        writer.append(" ");
        writer.appendIdentifier(PigLatinRules.translateIdentifier(name));
        writer.append(" {\n");

        for (StructField field : fields) {
            field.toPigLatin(writer, indent);
        }

        writer.append("}\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
