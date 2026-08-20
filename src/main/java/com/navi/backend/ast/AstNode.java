package com.navi.backend.ast;

import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.Getter;

import java.util.List;

@Getter
public abstract class AstNode {
    private final int line;
    private final int column;

    protected AstNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

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
