package com.navi.ui.symbols;

import com.navi.backend.semantic.Scope;
import com.navi.backend.semantic.Symbol;
import com.navi.backend.semantic.SymbolTable;
import lombok.Getter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer; // 1. Importación necesaria
import java.awt.*;
import java.util.Map;

@Getter
public class SymbolTablePanel extends JPanel {

    private static final Color BACKGROUND = new Color(35, 35, 35);
    private static final Color TEXT = new Color(224, 224, 224);
    private static final Color MIKU = new Color(57, 197, 187);

    private final DefaultTableModel model;
    private final JTable table;

    public SymbolTablePanel() {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(5, 5, 5, 5));

        model = new DefaultTableModel(new Object[]{"Nombre", "Tipo", "Clase", "Ámbito", "Valor"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(model);
        styleTable();
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    private void styleTable() {
        table.setBackground(BACKGROUND);
        table.setForeground(TEXT);
        table.setGridColor(new Color(55, 55, 55));
        table.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));
        table.setRowHeight(28);
        table.setSelectionBackground(new Color(40, 56, 56));
        table.setSelectionForeground(Color.WHITE);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        table.getTableHeader().setBackground(new Color(40, 56, 56));
        table.getTableHeader().setForeground(MIKU);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));
        table.getTableHeader().setReorderingAllowed(false);

        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        clear();
        if (symbolTable == null) return;

        addScopeSymbols(symbolTable.getGlobalScope(), "global");

        for (Map.Entry<String, Scope> entry : symbolTable.getFunctionScopes().entrySet()) {
            addScopeSymbols(entry.getValue(), entry.getKey());
        }
    }

    private void addScopeSymbols(Scope scope, String scopeName) {
        if (scope == null) return;

        for (Symbol symbol : scope.getSymbols().values()) {
            addSymbol(symbol, scopeName);
        }
    }

    private void addSymbol(Symbol symbol, String scopeName) {
        Object val = symbol.getValue();
        String displayValue;

        if (val == null) {
            displayValue = "—";
        } else if (val instanceof String) {
            displayValue = "\"" + val + "\"";
        } else {
            displayValue = val.toString();
        }

        model.addRow(new Object[]{symbol.getName(), symbol.getType(), symbol.getKind(), scopeName, displayValue});
    }

    public void clear() {
        model.setRowCount(0);
    }
}
