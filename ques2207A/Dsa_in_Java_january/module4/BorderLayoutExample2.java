package module4;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample2 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("BorderLayout Real Example");

        frame.setLayout(new BorderLayout());

        // North → Title
        JLabel title = new JLabel("Welcome to My App", JLabel.CENTER);
        frame.add(title, BorderLayout.NORTH);

        // South → Button
        JButton submit = new JButton("Submit");
        frame.add(submit, BorderLayout.SOUTH);

        // West → Menu Button
        JButton menu = new JButton("Menu");
        frame.add(menu, BorderLayout.WEST);

        // East → Exit Button
        JButton exit = new JButton("Exit");
        frame.add(exit, BorderLayout.EAST);

        // Center → Main Content
        JTextArea textArea = new JTextArea("Write something here...");
        frame.add(textArea, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}