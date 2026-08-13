package com.navi.ui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public final class UIStyles {

    private UIStyles() {
        // Utility class
    }

    // Colors
    private static final Color MIKU_BASE = new Color(57, 197, 187);
    private static final Color MIKU_BORDER = new Color(112, 169, 166);

    private static final Color MIKU_MENU_BACKGROUND = new Color(40, 56, 56);
    private static final Color MIKU_MENU_HOVER = new Color(47, 156, 149);

    private static final Color MIKU_BUTTON_BACKGROUND = new Color(40, 56, 56);
    private static final Color MIKU_BUTTON_TEXT = new Color(161, 244, 240);
    private static final Color MIKU_BUTTON_BORDER = new Color(39, 111, 107);
    private static final Color MIKU_BUTTON_HOVER = new Color(47, 156, 149);

    private static final Color LUKA_BUTTON_BACKGROUND = new Color(52, 47, 46);
    private static final Color LUKA_BUTTON_TEXT = new Color(255, 179, 222);
    private static final Color LUKA_BUTTON_BORDER = new Color(192, 163, 110);
    private static final Color LUKA_BUTTON_HOVER = new Color(186, 126, 160);

    private static final Font DEFAULT_FONT = new Font("Arial", Font.BOLD, 16);
    private static final Font MENU_FONT = new Font("Arial", Font.BOLD, 14);

    // Labels
    public static void mikuLabel(JLabel label) {
        label.setForeground(MIKU_BASE);
        label.setFont(DEFAULT_FONT);
    }

    // TextPane
    public static void mikuTextPane(JTextPane textPane) {
        textPane.setFont(DEFAULT_FONT);
        textPane.setForeground(MIKU_BASE);
        textPane.setBorder(new LineBorder(MIKU_BORDER, 2));
    }

    public static void mikuScrollPane(JScrollPane scrollPane) {
        scrollPane.setBorder(new LineBorder(MIKU_BORDER, 1));
    }

    // Buttons
    public static void mikuButton(JButton button) {
        button.setFont(DEFAULT_FONT);
        button.setForeground(MIKU_BUTTON_TEXT);
        button.setBackground(MIKU_BUTTON_BACKGROUND);
        button.setFocusPainted(false);
        button.setBorder(
                BorderFactory.createLineBorder(MIKU_BUTTON_BORDER, 2)
        );
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        addHoverEffect(
                button,
                MIKU_BUTTON_BACKGROUND,
                MIKU_BUTTON_HOVER
        );
    }

    public static void lukaButton(JButton button) {
        button.setFont(DEFAULT_FONT);
        button.setForeground(LUKA_BUTTON_TEXT);
        button.setBackground(LUKA_BUTTON_BACKGROUND);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(LUKA_BUTTON_BORDER, 2));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        addHoverEffect(button, LUKA_BUTTON_BACKGROUND, LUKA_BUTTON_HOVER);
    }

    public static void darkButton(JButton button) {
        Color background = new Color(60, 63, 65);
        Color foreground = new Color(169, 183, 198);
        Color border = new Color(87, 90, 92);
        Color hover = new Color(75, 78, 80);

        button.setFont(DEFAULT_FONT);
        button.setForeground(foreground);
        button.setBackground(background);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(border, 2));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        addHoverEffect(button, background, hover);
    }

    // Menus
    public static void mikuMenu(JMenu menu) {
        menu.setForeground(MIKU_BASE);
        menu.setFont(MENU_FONT);
        styleMenuItems(menu);
    }

    private static void styleMenuItems(JMenu menu) {
        for (int i = 0; i < menu.getMenuComponentCount(); i++) {
            Component component = menu.getMenuComponent(i);

            if (component instanceof JMenuItem item) {
                item.setBackground(MIKU_MENU_BACKGROUND);
                item.setForeground(MIKU_BASE);
                item.setFont(MENU_FONT);
                item.setOpaque(true);

                addHoverEffect(item, MIKU_MENU_BACKGROUND, MIKU_MENU_HOVER);
            }

            if (component instanceof JMenu submenu) {
                styleMenuItems(submenu);
            }
        }
    }

    // Hover
    private static void addHoverEffect(JComponent component, Color normalColor, Color hoverColor) {
        component.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                component.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                component.setBackground(normalColor);
            }
        });
    }
}