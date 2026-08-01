package module4;

import javax.swing.*;
import java.awt.event.*;

public class MenuExample2 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Menu Example 2");

        // Menu Bar
        JMenuBar mb = new JMenuBar();

        // Menu
        JMenu file = new JMenu("File");

        // Menu Items
        JMenuItem open = new JMenuItem("Open");
        JMenuItem about = new JMenuItem("About");
        JMenuItem exit = new JMenuItem("Exit");

        // Add items
        file.add(open);
        file.add(about);
        file.add(exit);

        mb.add(file);
        frame.setJMenuBar(mb);

        // Action: Open
        open.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(frame, "Open clicked!");
            }
        });

        // Action: About
        about.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(frame, "This is Menu Demo");
            }
        });

        // Action: Exit
        exit.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}