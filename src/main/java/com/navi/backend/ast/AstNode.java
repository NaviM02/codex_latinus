package com.navi.backend.ast;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class AstNode {
    public abstract void toPigLatin(StringBuilder sb, int indent);

    protected void indent(StringBuilder sb, int indent) {
        sb.append("    ".repeat(indent));
    }
}
