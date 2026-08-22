package com.navi.ui.ast;

import com.navi.backend.ast.AstNode;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class GraphvizRenderer {
    private final AstDotBuilder dotBuilder;

    public GraphvizRenderer() {
        this.dotBuilder = new AstDotBuilder();
    }

    public void render(AstNode root, Path outputFile) throws IOException, InterruptedException {
        String dot = dotBuilder.build(root);
        Path dotFile = Files.createTempFile("navi-ast-", ".dot");

        try {
            Files.writeString(dotFile, dot, StandardCharsets.UTF_8);
            renderDot(dotFile, outputFile);

        } finally {
            Files.deleteIfExists(dotFile);
        }
    }

    private void renderDot(Path dotFile, Path outputFile) throws IOException, InterruptedException {
        String format = getFormat(outputFile);
        ProcessBuilder processBuilder = new ProcessBuilder("dot", "-T" + format, dotFile.toAbsolutePath().toString(), "-o", outputFile.toAbsolutePath().toString());
        processBuilder.redirectErrorStream(true);

        Process process = processBuilder.start();
        String output = new String(process.getInputStream().readAllBytes(), StandardCharsets.UTF_8);

        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new IOException("Graphviz no pudo generar el archivo.\n" + output);
        }
    }

    private String getFormat(Path outputFile) {
        String fileName = outputFile.getFileName().toString().toLowerCase();
        if (fileName.endsWith(".svg")) return "svg";
        if (fileName.endsWith(".png")) return "png";

        throw new IllegalArgumentException("Formato no soportado. Use .svg o .png");
    }

    public String renderToSvg(AstNode root) throws IOException, InterruptedException {
        String dot = dotBuilder.build(root);
        Path dotFile = Files.createTempFile("navi-ast-", ".dot");
        Path svgFile = Files.createTempFile("navi-ast-", ".svg");

        try {
            Files.writeString(dotFile, dot, StandardCharsets.UTF_8);
            ProcessBuilder processBuilder = new ProcessBuilder("dot", "-Tsvg", dotFile.toAbsolutePath().toString(), "-o", svgFile.toAbsolutePath().toString());
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();
            String output = new String(process.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
            int exitCode = process.waitFor();

            if (exitCode != 0) {
                throw new IOException("Graphviz no pudo generar el SVG:\n" + output);
            }

            return Files.readString(svgFile, StandardCharsets.UTF_8);

        } finally {
            Files.deleteIfExists(dotFile);
            Files.deleteIfExists(svgFile);
        }
    }
}