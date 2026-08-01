package module4;


import javax.swing.*;
import java.awt.event.*;

public class WindowEventDemo 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Window Event Demo");

        frame.setSize(300, 200);
        frame.setVisible(true);

        // Window Event
        frame.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                JOptionPane.showMessageDialog(frame, "Window is closing!");
                System.exit(0);
            }
        });
    }
}