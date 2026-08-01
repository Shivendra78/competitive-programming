package challenging_Task;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WordPad_Shivendra_24BCE10389 extends JFrame {

    JTextArea textArea;
    String currentFile = null;

    public WordPad_Shivendra_24BCE10389() {
        setTitle("Mini WordPad 24BCE10389");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // ── Text Area ──────────────────────────────────────────────────────────
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // ── Menu Bar ───────────────────────────────────────────────────────────
        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");

        JMenuItem newItem = new JMenuItem("New");
        newItem.addActionListener(e -> newFile());

        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(e -> openFile());

        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(e -> saveFile());

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);

        // Edit Menu
        JMenu editMenu = new JMenu("Edit");

        JMenuItem cutItem = new JMenuItem("Cut");
        cutItem.addActionListener(e -> textArea.cut());

        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.addActionListener(e -> textArea.copy());

        JMenuItem pasteItem = new JMenuItem("Paste");
        pasteItem.addActionListener(e -> textArea.paste());

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Format Menu
        JMenu formatMenu = new JMenu("Format");

        JMenuItem fontSizeItem = new JMenuItem("Change Font Size");
        fontSizeItem.addActionListener(e -> changeFontSize());

        JMenuItem textColorItem = new JMenuItem("Change Text Color");
        textColorItem.addActionListener(e -> changeTextColor());

        formatMenu.add(fontSizeItem);
        formatMenu.add(textColorItem);

        // Extra Menu (Custom Feature: Insert Date/Time)
        JMenu extraMenu = new JMenu("Extra");

        JMenuItem wordCountItem = new JMenuItem("Word Count");
        wordCountItem.addActionListener(e -> showWordCount());

        JMenuItem dateTimeItem = new JMenuItem("Insert Date & Time");
        dateTimeItem.addActionListener(e -> insertDateTime());

        JMenuItem upperItem = new JMenuItem("UPPERCASE");
        upperItem.addActionListener(e -> textArea.setText(textArea.getText().toUpperCase()));

        JMenuItem lowerItem = new JMenuItem("lowercase");
        lowerItem.addActionListener(e -> textArea.setText(textArea.getText().toLowerCase()));

        JMenuItem bgColorItem = new JMenuItem("Background Color");
        bgColorItem.addActionListener(e -> changeBackgroundColor());

        extraMenu.add(wordCountItem);
        extraMenu.add(dateTimeItem);
        extraMenu.addSeparator();
        extraMenu.add(upperItem);
        extraMenu.add(lowerItem);
        extraMenu.addSeparator();
        extraMenu.add(bgColorItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        menuBar.add(extraMenu);
        setJMenuBar(menuBar);

        // ── Toolbar ────────────────────────────────────────────────────────────
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);

        JButton btnNew   = new JButton("New");
        JButton btnOpen  = new JButton("Open");
        JButton btnSave  = new JButton("Save");
        JButton btnCut   = new JButton("Cut");
        JButton btnCopy  = new JButton("Copy");
        JButton btnPaste = new JButton("Paste");
        JButton btnColor = new JButton("Text Color");
        JButton btnSize  = new JButton("Font Size");
        JButton btnWC    = new JButton("Word Count");

        btnNew.addActionListener(e   -> newFile());
        btnOpen.addActionListener(e  -> openFile());
        btnSave.addActionListener(e  -> saveFile());
        btnCut.addActionListener(e   -> textArea.cut());
        btnCopy.addActionListener(e  -> textArea.copy());
        btnPaste.addActionListener(e -> textArea.paste());
        btnColor.addActionListener(e -> changeTextColor());
        btnSize.addActionListener(e  -> changeFontSize());
        btnWC.addActionListener(e    -> showWordCount());

        toolBar.add(btnNew);
        toolBar.add(btnOpen);
        toolBar.add(btnSave);
        toolBar.addSeparator();
        toolBar.add(btnCut);
        toolBar.add(btnCopy);
        toolBar.add(btnPaste);
        toolBar.addSeparator();
        toolBar.add(btnColor);
        toolBar.add(btnSize);
        toolBar.addSeparator();
        toolBar.add(btnWC);

        add(toolBar, BorderLayout.NORTH);

        setVisible(true);
    }

    // ── File Operations ────────────────────────────────────────────────────────

    void newFile() {
        textArea.setText("");
        setTitle("Mini WordPad - New File");
        currentFile = null;
    }

    void openFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
                BufferedReader reader = new BufferedReader(new FileReader(file));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                reader.close();
                textArea.setText(sb.toString());
                currentFile = file.getAbsolutePath();
                setTitle("Mini WordPad - " + file.getName());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error opening file: " + ex.getMessage());
            }
        }
    }

    void saveFile() {
        if (currentFile != null) {
            writeToFile(currentFile);
        } else {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
            int result = chooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                String path = chooser.getSelectedFile().getAbsolutePath();
                if (!path.endsWith(".txt")) path += ".txt";
                writeToFile(path);
                currentFile = path;
                setTitle("Mini WordPad - " + new File(path).getName());
            }
        }
    }

    void writeToFile(String path) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write(textArea.getText());
            writer.close();
            JOptionPane.showMessageDialog(this, "File saved successfully!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
        }
    }

    // ── Formatting ─────────────────────────────────────────────────────────────

    void changeFontSize() {
        String input = JOptionPane.showInputDialog(this,
                "Enter font size (8 - 72):",
                textArea.getFont().getSize());
        if (input != null) {
            try {
                int size = Integer.parseInt(input.trim());
                if (size < 8 || size > 72) throw new NumberFormatException();
                textArea.setFont(new Font(textArea.getFont().getName(), Font.PLAIN, size));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number between 8 and 72.");
            }
        }
    }

    void changeTextColor() {
        Color color = JColorChooser.showDialog(this, "Choose Text Color", textArea.getForeground());
        if (color != null) {
            textArea.setForeground(color);
        }
    }

    // ── Extra Features ─────────────────────────────────────────────────────────

    void showWordCount() {
        String text = textArea.getText().trim();
        int words = 0;
        int chars = textArea.getText().length();
        if (!text.isEmpty()) {
            words = text.split("\\s+").length;
        }
        JOptionPane.showMessageDialog(this,
                "Words: " + words + "\nCharacters: " + chars,
                "Word Count", JOptionPane.INFORMATION_MESSAGE);
    }

    void insertDateTime() {
        String now = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss").format(new Date());
        textArea.insert(now, textArea.getCaretPosition());
    }

    void changeBackgroundColor() {
        Color color = JColorChooser.showDialog(this, "Choose Background Color", textArea.getBackground());
        if (color != null) {
            textArea.setBackground(color);
        }
    }

    // ── Main ───────────────────────────────────────────────────────────────────

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WordPad_Shivendra_24BCE10389::new);
    }
}