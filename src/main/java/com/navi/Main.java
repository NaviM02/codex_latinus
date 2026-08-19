package com.navi;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import com.navi.backend.parser.*;
import com.navi.backend.semantic.*;
import com.navi.ui.CompilerWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FlatMaterialDarkerIJTheme.setup();
        SwingUtilities.invokeLater(() -> {
            CompilerWindow window = new CompilerWindow();
            window.setVisible(true);
        });
    }

}