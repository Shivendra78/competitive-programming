package Collage.Module2;

// Importing required classes
import java.awt.BorderLayout; // For BorderLayout manager
import java.awt.Color; // For setting background colors
import java.awt.Dimension; // For setting preferred size
import javax.swing.JFrame; // For creating window frame
import javax.swing.JPanel; // For creating panels

public class BorderLayoutDemo { // Class name corrected

    // Layout Manager = It defines how components are arranged inside a container.
    // BorderLayout divides the container into 5 areas:
    // NORTH, SOUTH, EAST, WEST, CENTER
    // Extra space automatically goes to CENTER.

    public static void main(String[] args) {

        // Creating a JFrame (Main Window)
        JFrame frame = new JFrame();

        // This will close the program when we click the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting size of the frame
        frame.setSize(500, 500);

        // Setting BorderLayout with horizontal gap = 10 and vertical gap = 0
        frame.setLayout(new BorderLayout(10, 0));

        // Creating 5 panels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // Setting background colors for each panel
        panel1.setBackground(Color.RED); // NORTH
        panel2.setBackground(Color.GREEN); // WEST
        panel3.setBackground(Color.YELLOW); // EAST
        panel4.setBackground(Color.MAGENTA); // SOUTH
        panel5.setBackground(Color.BLUE); // CENTER

        // Setting preferred size (mainly useful for NORTH, SOUTH, EAST, WEST)
        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        // ------------------SUB PANELS------------------------

        // ------------------SUB PANELS------------------------

        // Creating 5 new panels to add inside panel5 (CENTER panel)
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        // Setting background colors
        panel6.setBackground(Color.BLACK); // NORTH
        panel7.setBackground(Color.DARK_GRAY); // WEST
        panel8.setBackground(Color.GRAY); // EAST
        panel9.setBackground(Color.LIGHT_GRAY); // SOUTH
        panel10.setBackground(Color.WHITE); // CENTER

        // Setting BorderLayout inside panel5
        panel5.setLayout(new BorderLayout());

        // Setting preferred sizes
        panel6.setPreferredSize(new Dimension(100, 100));
        panel7.setPreferredSize(new Dimension(100, 100));
        panel8.setPreferredSize(new Dimension(100, 100));
        panel9.setPreferredSize(new Dimension(100, 100));
        panel10.setPreferredSize(new Dimension(100, 100));

        // Adding sub-panels INSIDE panel5
        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);

        // Adding panels to frame in specific BorderLayout positions
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

        // Making frame visible (always keep this at the end)
        frame.setVisible(true);
    }
}