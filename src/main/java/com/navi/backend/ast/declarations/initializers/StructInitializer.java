package com.navi.backend.ast.declarations.initializers;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class StructInitializer extends Initializer {
    private List<StructFieldInitializer> fields;

    @Override
    public List<? extends AstNode> getChildren() {
        return fields;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.append("{");

        for (int i = 0; i < fields.size(); i++) {
            fields.get(i).toPigLatin(writer, indent);

            if (i < fields.size() - 1) writer.append(", ");
        }

        writer.append("}");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
