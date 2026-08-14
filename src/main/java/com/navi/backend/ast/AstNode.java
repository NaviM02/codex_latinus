package com.navi.backend.ast;

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
    public abstract void toPigLatin(StringBuilder sb, int indent);
    protected void indent(StringBuilder sb, int indent) {
        sb.append("    ".repeat(indent));
    }
}
