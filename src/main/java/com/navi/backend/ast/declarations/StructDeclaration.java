package com.navi.backend.ast.declarations;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.Getter;

import java.util.List;

@Getter
public class StructDeclaration extends Declaration {
    private final String name;
    private final List<StructField> fields;

    public StructDeclaration(int line, int column, String name, List<StructField> fields) {
        super(line, column);
        this.name = name;
        this.fields = fields;
    }

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
