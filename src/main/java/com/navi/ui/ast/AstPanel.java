package com.navi.ui.ast;

import com.navi.backend.ast.global.Program;
import lombok.Getter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.nio.file.Path;

@Getter
public class AstPanel extends JPanel {

    private static final Color BACKGROUND = new Color(35, 35, 35);

    private final AstDotBuilder dotBuilder;
    private final GraphvizRenderer graphvizRenderer;
    private final AstGraphvizPanel graphvizPanel;
    private final JScrollPane scrollPane;

    private Program currentProgram;

    public AstPanel() {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setBackground(BACKGROUND);

        dotBuilder = new AstDotBuilder();
        graphvizRenderer = new GraphvizRenderer();
        graphvizPanel = new AstGraphvizPanel();
        scrollPane = new JScrollPane(graphvizPanel);
        scrollPane.setBorder(null);
        scrollPane.getViewport().setBackground(BACKGROUND);

        scrollPane.getHorizontalScrollBar().setUnitIncrement(30);
        scrollPane.getVerticalScrollBar().setUnitIncrement(30);

        add(scrollPane, BorderLayout.CENTER);
        installMousePanning();
        installMouseWheelScrolling();
        clear();
    }

    public void setProgram(Program program) {
        currentProgram = program;
        if (program == null) {
            clear();
            return;
        }

        try {
            String svg = graphvizRenderer.renderToSvg(program);
            graphvizPanel.setSvg(svg);
        } catch (Exception ex) {
            graphvizPanel.showError("No se pudo generar el AST:\n" + ex.getMessage());
        }
    }

    public void clear() {
        graphvizPanel.clear();
    }

    public void exportAst(Path outputFile) throws IOException, InterruptedException {
        if (currentProgram == null) {
            JOptionPane.showMessageDialog(this, "No hay un AST disponible para exportar.", "Formato no soportado", JOptionPane.ERROR_MESSAGE);
            return;
        }

        graphvizRenderer.render(currentProgram, outputFile);
    }

    private void installMousePanning() {
        final Point[] dragStart = {null};

        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (!SwingUtilities.isRightMouseButton(e)) return;
                dragStart[0] = e.getPoint();
                graphvizPanel.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (dragStart[0] == null) return;
                JViewport viewport = scrollPane.getViewport();
                Point viewPosition = viewport.getViewPosition();

                int dx = dragStart[0].x - e.getX();
                int dy = dragStart[0].y - e.getY();

                viewPosition.translate(dx, dy);

                int maxX = graphvizPanel.getWidth() - viewport.getWidth();
                int maxY = graphvizPanel.getHeight() - viewport.getHeight();

                viewPosition.x = Math.max(0, Math.min(viewPosition.x, maxX));
                viewPosition.y = Math.max(0, Math.min(viewPosition.y, maxY));
                viewport.setViewPosition(viewPosition);
                dragStart[0] = e.getPoint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dragStart[0] = null;
                graphvizPanel.setCursor(Cursor.getDefaultCursor());
            }
        };

        graphvizPanel.addMouseListener(mouseAdapter);
        graphvizPanel.addMouseMotionListener(mouseAdapter);
    }

    private void installMouseWheelScrolling() {

        scrollPane.addMouseWheelListener(e -> {

            if (e.isControlDown()) {

                if (e.getWheelRotation() < 0) {
                    graphvizPanel.zoomIn();
                } else {
                    graphvizPanel.zoomOut();
                }

                e.consume();
                return;
            }

            JScrollBar scrollBar =
                    e.isShiftDown()
                            ? scrollPane.getHorizontalScrollBar()
                            : scrollPane.getVerticalScrollBar();

            int amount =
                    e.getWheelRotation() * 80;

            int newValue =
                    scrollBar.getValue() + amount;

            int maximum =
                    scrollBar.getMaximum()
                            - scrollBar.getVisibleAmount();

            newValue =
                    Math.max(
                            scrollBar.getMinimum(),
                            Math.min(
                                    newValue,
                                    maximum
                            )
                    );

            scrollBar.setValue(newValue);

            e.consume();
        });
    }
}
