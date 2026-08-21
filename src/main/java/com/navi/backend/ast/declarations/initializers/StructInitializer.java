package com.navi.backend.ast.declarations.initializers;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.Getter;

import java.util.List;

@Getter
public class StructInitializer extends Initializer {
    private final List<StructFieldInitializer> fields;

    public StructInitializer(int line, int column, List<StructFieldInitializer> fields) {
        super(line, column);
        this.fields = fields;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        return fields;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.append("{\n");

        for (int i = 0; i < fields.size(); i++) {
            fields.get(i).toPigLatin(writer, indent + 1);
            if (i < fields.size() - 1) writer.append(",\n");
        }

        writer.append("\n}");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
