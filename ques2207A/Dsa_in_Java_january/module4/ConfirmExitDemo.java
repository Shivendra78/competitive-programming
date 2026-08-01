package module4;


import javax.swing.*;
import java.awt.event.*;

public class ConfirmExitDemo 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Confirm Exit Demo");

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);

        // Window Event
        frame.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                int choice = JOptionPane.showConfirmDialog(
                        frame,
                        "Are you sure you want to exit?",
                        "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION
                );

                if(choice == JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
            }
        });
    }
}