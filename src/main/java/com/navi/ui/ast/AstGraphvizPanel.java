package com.navi.ui.ast;

import javax.swing.*;
import java.awt.*;
import java.io.StringReader;

import lombok.Getter;
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.bridge.BridgeContext;
import org.apache.batik.bridge.GVTBuilder;
import org.apache.batik.bridge.UserAgentAdapter;
import org.apache.batik.gvt.GraphicsNode;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.svg.SVGDocument;

public class AstGraphvizPanel extends JPanel {

    private static final Color BACKGROUND = new Color(35, 35, 35);

    private GraphicsNode graphicsNode;

    @Getter
    private double zoom = 1.0;

    private static final double MIN_ZOOM = 0.25;
    private static final double MAX_ZOOM = 3.0;
    private static final double ZOOM_STEP = 0.1;

    public AstGraphvizPanel() {
        setLayout(new BorderLayout());
        setBackground(BACKGROUND);
        setOpaque(true);
    }

    public void setSvg(String svg) {
        try {
            String parser = XMLResourceDescriptor.getXMLParserClassName();
            SAXSVGDocumentFactory factory = new SAXSVGDocumentFactory(parser);
            SVGDocument document = factory.createSVGDocument(null, new StringReader(svg));
            UserAgentAdapter userAgent = new UserAgentAdapter();
            BridgeContext bridgeContext = new BridgeContext(userAgent);
            bridgeContext.setDynamicState(org.apache.batik.bridge.BridgeContext.STATIC);
            GVTBuilder builder = new GVTBuilder();
            graphicsNode = builder.build(bridgeContext, document);

            bridgeContext.dispose();

            revalidate();
            repaint();

        } catch (Exception ex) {
            graphicsNode = null;
            showError("No se pudo renderizar el SVG:\n" + ex.getMessage());
        }
    }

    public void clear() {
        graphicsNode = null;
        revalidate();
        repaint();
    }

    public void showError(String message) {
        graphicsNode = null;
        removeAll();
        JLabel label = new JLabel("<html><center>" + message.replace("\n", "<br>") + "</center></html>");

        label.setForeground(new Color(224, 224, 224));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        revalidate();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (graphicsNode == null) return;
        Graphics2D g2 = (Graphics2D) g.create();

        try {
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.scale(zoom, zoom);
            graphicsNode.paint(g2);
        } finally {
            g2.dispose();
        }
    }

    @Override
    public Dimension getPreferredSize() {
        if (graphicsNode == null) return new Dimension(600, 400);
        Rectangle bounds = graphicsNode.getBounds().getBounds();
        int width = (int) (bounds.width * zoom) + 100;
        int height = (int) (bounds.height * zoom) + 100;

        return new Dimension(Math.max(600, width), Math.max(400, height));
    }

    public void zoomIn() {
        setZoom(zoom + ZOOM_STEP);
    }

    public void zoomOut() {
        setZoom(zoom - ZOOM_STEP);
    }

    public void resetZoom() {
        setZoom(1.0);
    }

    public void setZoom(double zoom) {
        this.zoom = Math.max(
                MIN_ZOOM,
                Math.min(MAX_ZOOM, zoom)
        );

        revalidate();
        repaint();
    }

}