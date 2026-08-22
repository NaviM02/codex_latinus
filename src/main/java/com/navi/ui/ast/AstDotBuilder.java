package com.navi.ui.ast;

import com.navi.backend.ast.AstNode;

public class AstDotBuilder {
    private int nodeCounter;

    public String build(AstNode root) {
        nodeCounter = 0;

        StringBuilder dot = new StringBuilder();

        dot.append("digraph AST {\n");

        dot.append("    graph [\n");
        dot.append("        rankdir=TB,\n");
        dot.append("        bgcolor=\"#232323\",\n");
        dot.append("        pad=0.5,\n");
        dot.append("        nodesep=0.35,\n");
        dot.append("        ranksep=0.7\n");
        dot.append("    ];\n");

        dot.append("    node [\n");
        dot.append("        shape=box,\n");
        dot.append("        style=\"rounded,filled\",\n");
        dot.append("        fillcolor=\"#232323\",\n");
        dot.append("        color=\"#39C5BB\",\n");
        dot.append("        fontcolor=\"#E0E0E0\",\n");
        dot.append("        fontname=\"Monospace\",\n");
        dot.append("        fontsize=11,\n");
        dot.append("        margin=\"0.15,0.10\"\n");
        dot.append("    ];\n");

        dot.append("    edge [\n");
        dot.append("        color=\"#5A5A5A\",\n");
        dot.append("        penwidth=1.5,\n");
        dot.append("        arrowsize=0.6\n");
        dot.append("    ];\n");

        if (root != null) {
            appendNode(root, dot);
        }

        dot.append("}\n");

        return dot.toString();
    }

    private String appendNode(AstNode node, StringBuilder dot) {
        String nodeId = "node_" + nodeCounter++;

        String label = escape(node.getNodeLabel());

        dot.append("    ")
            .append(nodeId)
            .append(" [label=\"")
            .append(label)
            .append("\"];\n");

        for (AstNode child : node.getChildren()) {
            if (child == null) {
                continue;
            }

            String childId = appendNode(child, dot);

            dot.append("    ")
                .append(nodeId)
                .append(" -> ")
                .append(childId)
                .append(";\n");
        }

        return nodeId;
    }

    private String escape(String text) {
        if (text == null) {
            return "";
        }

        return text
            .replace("\\", "\\\\")
            .replace("\"", "\\\"")
            .replace("\n", "\\n")
            .replace("\r", "");
    }
}