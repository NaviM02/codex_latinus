package com.navi.backend.ast;

import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public abstract class AstNode {
    public abstract List<? extends AstNode> getChildren();
    public String getNodeLabel() {
        return getClass().getSimpleName();
    }
    public abstract void toPigLatin(PigLatinWriter writer, int indent);
    public abstract <R> R accept(AstVisitor<R> visitor);
    protected void indent(PigLatinWriter writer, int indent) {
        writer.append("    ".repeat(indent));
    }
}
