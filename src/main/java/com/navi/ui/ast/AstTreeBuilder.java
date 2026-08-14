package com.navi.ui.ast;

import com.navi.backend.ast.AstNode;

import javax.swing.tree.DefaultMutableTreeNode;

public class AstTreeBuilder {

    public DefaultMutableTreeNode build(AstNode node) {
        if (node == null) {
            return null;
        }

        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(getNodeLabel(node));

        for (AstNode child : node.getChildren()) {
            DefaultMutableTreeNode childNode = build(child);

            if (childNode != null) {
                treeNode.add(childNode);
            }
        }

        return treeNode;
    }

    private String getNodeLabel(AstNode node) {
        return node.getNodeLabel();
    }
}