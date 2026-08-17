package com.navi.ui;

import com.navi.backend.compiler.CompilationResult;
import com.navi.backend.compiler.CompilerService;
import com.navi.ui.ast.AstPanel;
import com.navi.ui.console.ConsolePanel;
import com.navi.ui.editor.EditorPanel;
import com.navi.ui.output.PigLatinPanel;
import com.navi.ui.parser.ParserTracePanel;
import com.navi.ui.symbols.SymbolTablePanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.*;

public class CompilerWindow extends JFrame {

    private static final Color MIKU = new Color(57, 197, 187);
    private static final Color MIKU_LIGHT = new Color(161, 244, 240);
    private static final Color MIKU_BORDER = new Color(39, 111, 107);
    private static final Color MIKU_HOVER = new Color(47, 156, 149);
    private static final Color BACKGROUND = new Color(28, 28, 28);

    private final CompilerService compilerService;

    private EditorPanel editorPanel;
    private ConsolePanel consolePanel;
    private AstPanel astPanel;
    private SymbolTablePanel symbolTablePanel;
    private ParserTracePanel parserTracePanel;
    private PigLatinPanel pigLatinPanel;

    private JTabbedPane resultTabs;

    private JLabel lineLabel;
    private JLabel columnLabel;
    private JLabel fileLabel;
    private JLabel statusLabel;

    private JButton compileButton;

    private File currentFile;

    public CompilerWindow() {
        setTitle("PigLatin Compiler");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1200, 750));
        setSize(1400, 850);
        setLocationRelativeTo(null);

        compilerService = new CompilerService();

        initComponents();
        initStyles();
        initListeners();
    }

    private void initComponents() {
        editorPanel = new EditorPanel();
        consolePanel = new ConsolePanel();
        astPanel = new AstPanel();
        symbolTablePanel = new SymbolTablePanel();
        parserTracePanel = new ParserTracePanel();
        pigLatinPanel = new PigLatinPanel();

        resultTabs = new JTabbedPane();
        resultTabs.addTab("AST", astPanel);
        resultTabs.addTab("Tabla de símbolos", symbolTablePanel);
        resultTabs.addTab("Pila del parser", parserTracePanel);
        resultTabs.addTab("PigLatin", pigLatinPanel);

        compileButton = new JButton("Compilar");

        lineLabel = new JLabel("Línea: 1");
        columnLabel = new JLabel("Columna: 1");
        fileLabel = new JLabel("Sin archivo");
        statusLabel = new JLabel("● Listo");

        setJMenuBar(createMenuBar());

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(8, 8, 8, 8));

        mainPanel.add(createToolbar(), BorderLayout.NORTH);
        mainPanel.add(createMainContent(), BorderLayout.CENTER);
        mainPanel.add(createStatusBar(), BorderLayout.SOUTH);

        setContentPane(mainPanel);
    }

    private JPanel createMainContent() {
        JPanel content = new JPanel(new BorderLayout(8, 8));
        JSplitPane mainSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, editorPanel, createBottomPanel());

        mainSplit.setResizeWeight(0.68);
        mainSplit.setDividerSize(8);

        content.add(mainSplit, BorderLayout.CENTER);

        return content;
    }

    private JPanel createBottomPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, resultTabs, consolePanel);

        split.setResizeWeight(0.68);
        split.setDividerSize(8);

        panel.add(split, BorderLayout.CENTER);

        return panel;
    }

    private JPanel createToolbar() {
        JPanel toolbar = new JPanel(new BorderLayout());
        JPanel left = new JPanel(new FlowLayout(FlowLayout.LEFT, 6, 4));

        left.add(compileButton);

        JButton clearButton = new JButton("Limpiar consola");
        clearButton.addActionListener(e -> consolePanel.clear());
        styleButton(clearButton);
        left.add(clearButton);
        toolbar.add(left, BorderLayout.WEST);

        JPanel right = new JPanel(new FlowLayout(FlowLayout.RIGHT, 6, 4));
        right.add(statusLabel);
        toolbar.add(right, BorderLayout.EAST);

        return toolbar;
    }

    private JPanel createStatusBar() {
        JPanel statusBar = new JPanel(new BorderLayout());
        statusBar.setBorder(BorderFactory.createEmptyBorder(5, 8, 2, 8));

        JPanel left = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        left.add(lineLabel);
        left.add(columnLabel);

        JPanel right = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 0));
        right.add(fileLabel);
        right.add(new JLabel("UTF-8"));

        statusBar.add(left, BorderLayout.WEST);
        statusBar.add(right, BorderLayout.EAST);

        return statusBar;
    }

    private void initListeners() {
        compileButton.addActionListener(e -> compile());
        editorPanel.addCaretListener(e -> updateCaretPosition());
    }

    private void updateCaretPosition() {
        try {
            JTextPane editor = editorPanel.getEditor();
            int position = editor.getCaretPosition();
            javax.swing.text.Element root = editor.getDocument().getDefaultRootElement();

            int line = root.getElementIndex(position);
            int start = root.getElement(line).getStartOffset();
            int column = position - start;

            lineLabel.setText("Línea: " + (line + 1));
            columnLabel.setText("Columna: " + (column + 1));
        } catch (Exception ignored) {
        }
    }

    private void compile() {
        consolePanel.clear();
        consolePanel.append("Analizando código fuente...\n");

        String source = editorPanel.getText();

        if (source.isBlank()) {
            consolePanel.append("El código fuente está vacío.\n");
            statusLabel.setText("Error");
            return;
        }

        try {
            CompilationResult result = compilerService.compile(source);

            if (!result.isSuccessful()) {
                showCompilationErrors(result);
                return;
            }

            consolePanel.append("Análisis léxico completado.\n");
            consolePanel.append("Análisis sintáctico completado.\n");
            consolePanel.append("AST generado correctamente.\n");
            consolePanel.append("Tabla de símbolos generada.\n");
            consolePanel.append("Análisis semántico completado.\n");
            consolePanel.append("Parser Trace generado.\n");
            consolePanel.append("Traducción PigLatin generada.\n");
            consolePanel.append("\nCOMPILACIÓN EXITOSA\n");

            updateCompilationResults(result);

            statusLabel.setText("Compilación exitosa");
            resultTabs.setSelectedIndex(0);
        } catch (Exception e) {
            consolePanel.append("\nError inesperado durante la compilación.\n");
            consolePanel.append(e.getMessage() + "\n");
            statusLabel.setText("Error");
            e.printStackTrace();
        }
    }

    private void showCompilationErrors(CompilationResult result) {
        if (!result.getSyntaxErrors().isEmpty()) {
            consolePanel.append("\nERRORES SINTÁCTICOS\n\n");

            for (String error : result.getSyntaxErrors()) {
                consolePanel.append("ERROR: " + error + "\n");
            }

            statusLabel.setText("Error sintáctico");
            return;
        }

        if (!result.getSemanticErrors().isEmpty()) {
            consolePanel.append("\nERRORES SEMÁNTICOS\n\n");

            for (String error : result.getSemanticErrors()) {
                consolePanel.append("ERROR: " + error + "\n");
            }

            statusLabel.setText("Error semántico");
        }
    }

    private void updateCompilationResults(CompilationResult result) {
        astPanel.setProgram(result.getProgram());
        symbolTablePanel.setSymbolTable(result.getSymbolTable());
        parserTracePanel.setParserTrace(result.getParserTrace());
        pigLatinPanel.setPigLatin(result.getPigLatin(), result.getPigLatinTokens());
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = createFileMenu();
        JMenu compileMenu = new JMenu("Compilar");
        JMenuItem compile = new JMenuItem("Compilar");
        JMenuItem clear = new JMenuItem("Limpiar consola");

        compile.addActionListener(e -> compile());
        clear.addActionListener(e -> consolePanel.clear());

        compileMenu.add(compile);
        compileMenu.add(clear);

        JMenu viewMenu = createViewMenu();

        menuBar.add(fileMenu);
        menuBar.add(compileMenu);
        menuBar.add(viewMenu);

        return menuBar;
    }

    private JMenu createViewMenu() {
        JMenu viewMenu = new JMenu("Visualizar");

        JMenuItem ast = new JMenuItem("AST");
        JMenuItem symbols = new JMenuItem("Tabla de símbolos");
        JMenuItem stack = new JMenuItem("Pila del parser");
        JMenuItem pigLatin = new JMenuItem("PigLatin");

        ast.addActionListener(e -> resultTabs.setSelectedIndex(0));
        symbols.addActionListener(e -> resultTabs.setSelectedIndex(1));
        stack.addActionListener(e -> resultTabs.setSelectedIndex(2));
        pigLatin.addActionListener(e -> resultTabs.setSelectedIndex(3));

        viewMenu.add(ast);
        viewMenu.add(symbols);
        viewMenu.add(stack);
        viewMenu.add(pigLatin);

        return viewMenu;
    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("Archivo");

        JMenuItem newFile = new JMenuItem("Nuevo");
        JMenuItem openFile = new JMenuItem("Abrir .lat...");
        JMenuItem saveFile = new JMenuItem("Guardar");
        JMenuItem saveAsFile = new JMenuItem("Guardar como...");
        JMenuItem exportPigLatin = new JMenuItem("Exportar .pig");
        JMenuItem exit = new JMenuItem("Salir");

        newFile.addActionListener(e -> newFile());
        openFile.addActionListener(e -> openFile());
        saveFile.addActionListener(e -> saveFile());
        saveAsFile.addActionListener(e -> saveFileAs());
        exportPigLatin.addActionListener(e -> exportPigLatin());
        exit.addActionListener(e -> System.exit(0));

        fileMenu.add(newFile);
        fileMenu.addSeparator();
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(saveAsFile);
        fileMenu.addSeparator();
        fileMenu.add(exportPigLatin);
        fileMenu.addSeparator();
        fileMenu.add(exit);

        return fileMenu;
    }

    private void newFile() {
        currentFile = null;
        editorPanel.setText("");
        fileLabel.setText("Sin archivo");
        statusLabel.setText("Nuevo archivo");
        consolePanel.setText("Nuevo archivo creado.\n");
    }

    private void openFile() {
        JFileChooser chooser = new JFileChooser();

        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos PigLatin (*.lat)", "lat"));

        if (chooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File file = chooser.getSelectedFile();

        try {
            StringBuilder content = new StringBuilder();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

            editorPanel.setText(content.toString());
            currentFile = file;

            fileLabel.setText(file.getName());
            statusLabel.setText("Archivo abierto");

            consolePanel.setText("Archivo abierto: " + file.getAbsolutePath() + "\n");
        } catch (IOException e) {
            showError("No se pudo abrir el archivo.\n" + e.getMessage());
        }
    }

    private void saveFile() {
        if (currentFile == null) {
            saveFileAs();
            return;
        }

        writeFile(currentFile);
    }

    private void saveFileAs() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos PigLatin (*.lat)", "lat"));

        if (chooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File file = chooser.getSelectedFile();

        if (!file.getName().toLowerCase().endsWith(".lat")) {
            file = new File(file.getAbsolutePath() + ".lat");
        }

        currentFile = file;
        writeFile(file);
    }

    private void writeFile(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(editorPanel.getText());

            fileLabel.setText(file.getName());
            statusLabel.setText("Archivo guardado");

            consolePanel.append("\nArchivo guardado: " + file.getAbsolutePath() + "\n");
        } catch (IOException e) {
            showError("No se pudo guardar el archivo.\n" + e.getMessage());
        }
    }

    private void exportPigLatin() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos PigLatin (*.pig)", "pig"));
        if (chooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File file = chooser.getSelectedFile();
        if (!file.getName().toLowerCase().endsWith(".pig")) {
            file = new File(file.getAbsolutePath() + ".pig");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(pigLatinPanel.getText());
            consolePanel.append("\nTraducción PigLatin exportada.\n");
        } catch (IOException e) {
            showError("No se pudo exportar el archivo.\n" + e.getMessage());
        }
    }

    private void initStyles() {
        getContentPane().setBackground(BACKGROUND);

        styleButton(compileButton);

        styleLabel(lineLabel);
        styleLabel(columnLabel);
        styleLabel(fileLabel);
        styleLabel(statusLabel);

        styleMenuBar(getJMenuBar());
    }

    private void styleButton(JButton button) {
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(MIKU_LIGHT);
        button.setBackground(new Color(40, 56, 56));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(MIKU_BORDER, 2));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Color normal = button.getBackground();

        button.addMouseListener(
            new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent e) {
                    button.setBackground(MIKU_HOVER);
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent e) {
                    button.setBackground(normal);
                }
            }
        );
    }

    private void styleLabel(JLabel label) {
        label.setForeground(MIKU);
        label.setFont(new Font("Arial", Font.BOLD, 13));
    }

    private void styleMenuBar(JMenuBar menuBar) {
        for (int i = 0; i < menuBar.getMenuCount(); i++) {
            JMenu menu = menuBar.getMenu(i);

            menu.setForeground(MIKU);
            menu.setFont(new Font("Arial", Font.BOLD, 14));

            styleMenu(menu);
        }
    }

    private void styleMenu(JMenu menu) {
        for (Component component : menu.getMenuComponents()) {
            if (component instanceof JMenuItem item) {
                item.setForeground(MIKU);
                item.setBackground(new Color(40, 56, 56));
                item.setFont(new Font("Arial", Font.BOLD, 14));
                item.setOpaque(true);
            }

            if (component instanceof JMenu submenu) {
                styleMenu(submenu);
            }
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
        statusLabel.setText("● Error");
    }
}