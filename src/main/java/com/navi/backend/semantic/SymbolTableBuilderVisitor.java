package com.navi.backend.semantic;

import com.navi.backend.ast.declarations.*;
import com.navi.backend.ast.declarations.initializers.ExpressionInitializer;
import com.navi.backend.ast.declarations.initializers.StructFieldInitializer;
import com.navi.backend.ast.declarations.initializers.StructInitializer;
import com.navi.backend.ast.expressions.*;
import com.navi.backend.ast.expressions.literals.*;
import com.navi.backend.ast.global.*;
import com.navi.backend.ast.statements.*;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.semantic.errors.SemanticException;

import java.util.List;

public class SymbolTableBuilderVisitor implements AstVisitor<Void> {
    private final SymbolTable symbolTable;
    public SymbolTableBuilderVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    public void build(Program program) {
        program.accept(this);
    }

    @Override
    public Void visit(Program node) {
        if (node.getGlobalVariables() != null) {
            node.getGlobalVariables().accept(this);
        }

        if (node.getFunctions() != null) {
            for (FunctionDeclaration function : node.getFunctions()) {
                function.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(GlobalVariableSection node) {
        for (Declaration declaration : node.getDeclarations()) {
            declaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration node) {
        List<String> parameterTypes = node.getParameters().stream().map(Parameter::getType).toList();
        String returnType = node.getReturnType();

        if (returnType == null) {
            returnType = TypeSystem.VOID;
        }

        Symbol functionSymbol = new Symbol(node.getName(), SymbolKind.FUNCTION, returnType, parameterTypes);

        if (!symbolTable.define(functionSymbol)) {
            throw new SemanticException("Function '" + node.getName() + "' is already declared.");
        }

        symbolTable.enterScope();

        if (node.getParameters() != null) {
            for (Parameter parameter : node.getParameters()) {
                parameter.accept(this);
            }
        }

        if (node.getBody() != null && node.getBody().getLocalVariables() != null) {
            node.getBody().getLocalVariables().accept(this);
        }

        symbolTable.registerFunctionScope(node.getName());
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visit(FunctionBody node) {
        return null;
    }

    @Override
    public Void visit(Parameter node) {
        Symbol symbol = new Symbol(node.getName(), SymbolKind.PARAMETER, node.getType());
        symbolTable.define(symbol);
        return null;
    }

    @Override
    public Void visit(LocalVariableSection node) {
        for (Declaration declaration : node.getDeclarations()) {
            declaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(VariableDeclaration node) {
        Symbol symbol = new Symbol(node.getName(), SymbolKind.VARIABLE, node.getType());
        symbolTable.define(symbol);
        return null;
    }

    @Override
    public Void visit(ArrayDeclaration node) {
        Symbol symbol = new Symbol(node.getName(), SymbolKind.ARRAY, node.getType());
        symbolTable.define(symbol);
        return null;
    }

    @Override
    public Void visit(ArrayInitializer node) {
        return null;
    }

    @Override
    public Void visit(StructDeclaration node) {
        Symbol symbol = new Symbol(node.getName(), SymbolKind.STRUCT, null);
        symbolTable.define(symbol);
        return null;
    }

    @Override
    public Void visit(StructField node) {
        return null;
    }

    @Override
    public Void visit(ExpressionInitializer node) {
        return null;
    }

    @Override
    public Void visit(StructInitializer node) {
        return null;
    }

    @Override
    public Void visit(StructFieldInitializer node) {
        return null;
    }

    @Override
    public Void visit(AssignmentStatement node) {
        return null;
    }

    @Override
    public Void visit(BlockStatement node) {
        return null;
    }

    @Override
    public Void visit(BreakStatement node) {
        return null;
    }

    @Override
    public Void visit(ContinueStatement node) {
        return null;
    }

    @Override
    public Void visit(DoWhileStatement node) {
        return null;
    }

    @Override
    public Void visit(ElseIfStatement node) {
        return null;
    }

    @Override
    public Void visit(ForStatement node) {
        return null;
    }

    @Override
    public Void visit(IfStatement node) {
        return null;
    }

    @Override
    public Void visit(IncrementStatement node) {
        return null;
    }

    @Override
    public Void visit(PrintStatement node) {
        return null;
    }

    @Override
    public Void visit(ReadStatement node) {
        return null;
    }

    @Override
    public Void visit(ReturnStatement node) {
        return null;
    }

    @Override
    public Void visit(WhileStatement node) {
        return null;
    }

    @Override
    public Void visit(ArrayAccessExpression node) {
        return null;
    }

    @Override
    public Void visit(BinaryExpression node) {
        return null;
    }

    @Override
    public Void visit(FunctionCallExpression node) {
        return null;
    }

    @Override
    public Void visit(MemberAccessExpression node) {
        return null;
    }

    @Override
    public Void visit(UnaryExpression node) {
        return null;
    }

    @Override
    public Void visit(VariableExpression node) {
        return null;
    }

    @Override
    public Void visit(BooleanLiteral node) {
        return null;
    }

    @Override
    public Void visit(CharLiteral node) {
        return null;
    }

    @Override
    public Void visit(DecimalLiteral node) {
        return null;
    }

    @Override
    public Void visit(NumberLiteral node) {
        return null;
    }

    @Override
    public Void visit(StringLiteral node) {
        return null;
    }
}