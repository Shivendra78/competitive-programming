package module4;

import javax.swing.*;
import java.awt.event.*;

public class AllInOneDemo 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("All In One Demo");

        // Menu Bar
        JMenuBar mb = new JMenuBar();

        // Menu
        JMenu menu = new JMenu("Menu");
        menu.setMnemonic('M');  // Alt + M

        // Menu Items
        JMenuItem msg = new JMenuItem("Message");
        JMenuItem input = new JMenuItem("Input");
        JMenuItem confirm = new JMenuItem("Confirm");
        JMenuItem exit = new JMenuItem("Exit");

        // Shortcut (Ctrl + E)
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));

        // Add items
        menu.add(msg);
        menu.add(input);
        menu.add(confirm);
        menu.add(exit);

        mb.add(menu);
        frame.setJMenuBar(mb);

        // Action: Message
        msg.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(frame, "Hello Shivam!");
            }
        });

        // Action: Input
        input.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String name = JOptionPane.showInputDialog("Enter your name");
                JOptionPane.showMessageDialog(frame, "Welcome " + name);
            }
        });

        // Action: Confirm
        confirm.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                int res = JOptionPane.showConfirmDialog(frame, "Are you sure?");
                if(res == JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog(frame, "Yes clicked");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame, "No clicked");
                }
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

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}