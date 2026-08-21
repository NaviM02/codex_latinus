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
import com.navi.backend.semantic.errors.SemanticErrors;
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
            for (Declaration declaration : node.getGlobalVariables().getDeclarations()) {
                if (declaration instanceof StructDeclaration struct) {
                    Symbol symbol = new Symbol(struct.getName(), SymbolKind.STRUCT, null);

                    if (!symbolTable.define(symbol)) {
                        SemanticErrors.reportError(new SemanticException("Line " + struct.getLine() + ":" + struct.getColumn() + " ERROR: Struct '" + struct.getName() + "' is already declared."));
                    }
                }
            }
        }

        if (node.getGlobalVariables() != null) {
            try {
                node.getGlobalVariables().accept(this);
            } catch (SemanticException e) {
                SemanticErrors.reportError(e);
            }
        }

        if (node.getFunctions() != null) {
            for (FunctionDeclaration function : node.getFunctions()) {
                try {
                    function.accept(this);
                } catch (SemanticException e) {
                    SemanticErrors.reportError(e);
                }
            }
        }

        if (node.getMainStatements() != null) {
            for (Statement statement : node.getMainStatements()) {
                try {
                    statement.accept(this);
                } catch (SemanticException e) {
                    SemanticErrors.reportError(e);
                }
            }
        }

        return null;
    }

    @Override
    public Void visit(GlobalVariableSection node) {
        for (Declaration declaration : node.getDeclarations()) {
            try {
                declaration.accept(this);
            } catch (SemanticException e) {
                SemanticErrors.reportError(e);
            }
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
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " ERROR: Function '" + node.getName() + "' is already declared.");
        }

        symbolTable.enterScope();

        if (node.getParameters() != null) {
            for (Parameter parameter : node.getParameters()) {
                try {
                    parameter.accept(this);
                } catch (SemanticException e) {
                    SemanticErrors.reportError(e);
                }
            }
        }

        if (node.getBody() != null && node.getBody().getLocalVariables() != null) {
            try {
                node.getBody().getLocalVariables().accept(this);
            } catch (SemanticException e) {
                SemanticErrors.reportError(e);
            }
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
        if (!symbolTable.define(symbol)) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " ERROR: Parameter '" + node.getName() + "' is already defined.");
        }
        return null;
    }

    @Override
    public Void visit(LocalVariableSection node) {
        for (Declaration declaration : node.getDeclarations()) {
            try {
                declaration.accept(this);
            } catch (SemanticException e) {
                SemanticErrors.reportError(e);
            }
        }
        return null;
    }

    @Override
    public Void visit(VariableDeclaration node) {
        Symbol symbol = new Symbol(node.getName(), SymbolKind.VARIABLE, node.getType());
        if (!symbolTable.define(symbol)) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " ERROR: Variable '" + node.getName() + "' is already declared.");
        }
        return null;
    }

    @Override
    public Void visit(ArrayDeclaration node) {
        Symbol symbol = new Symbol(node.getName(), SymbolKind.ARRAY, node.getType());

        if (node.getSize() instanceof NumberLiteral sizeLiteral) {
            int size = sizeLiteral.getValue();
            symbol.setArraySize(size);
        }

        if (!symbolTable.define(symbol)) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " ERROR: Array '" + node.getName() + "' is already declared.");
        }
        return null;
    }

    @Override
    public Void visit(ArrayInitializer node) {
        return null;
    }

    @Override
    public Void visit(StructDeclaration node) {
        Scope structScope = new Scope(symbolTable.getGlobalScope());

        for (StructField field : node.getFields()) {
            String fieldType = field.getType();

            if (!TypeSystem.isPrimitive(fieldType) && symbolTable.getStructScope(fieldType) == null) {
                SemanticErrors.reportError(new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " ERROR: Unknown type '" + fieldType + "' in field '" + field.getName() + "' of struct '" + node.getName() + "'."));
                continue;
            }

            SymbolKind kind = field.isArray() ? SymbolKind.ARRAY : SymbolKind.FIELD;
            Symbol fieldSymbol = new Symbol(field.getName(), kind, fieldType);

            if (!structScope.define(fieldSymbol)) {
                SemanticErrors.reportError(new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " ERROR: Field '" + field.getName() + "' is already declared in struct '" + node.getName() + "'."));
            }
        }

        symbolTable.registerStructScope(node.getName(), structScope);
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
        for (Statement statement : node.getStatements()) {
            statement.accept(this);
        }
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
        if (node.getBlock() != null) node.getBlock().accept(this);
        return null;
    }

    @Override
    public Void visit(ElseIfStatement node) {
        if (node.getBlock() != null) node.getBlock().accept(this);
        return null;
    }

    @Override
    public Void visit(ForStatement node) {
        symbolTable.enterScope();
        Scope forScope = symbolTable.getCurrentScope();

        try {
            if (node.getInitializer() != null) node.getInitializer().accept(this);
            if (node.getBlock() != null) node.getBlock().accept(this);

            String forName = node.getLine() + ":" + node.getColumn();
            symbolTable.registerBlockScope(forName, forScope);

        } finally {
            symbolTable.exitScope();
        }

        return null;
    }

    @Override
    public Void visit(FunctionCallStatement node) {
        if (node.getCallee() != null) node.getCallee().accept(this);

        if (node.getArguments() != null) {
            for (Expression argument : node.getArguments()) {
                argument.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(IfStatement node) {
           if (node.getThenBlock() != null) node.getThenBlock().accept(this);

        if (node.getElseIfStatements() != null) {
            for (ElseIfStatement elseIf : node.getElseIfStatements()) {
                elseIf.accept(this);
            }
        }

        if (node.getElseBlock() != null) node.getElseBlock().accept(this);
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
        if (node.getBlock() != null) node.getBlock().accept(this);
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