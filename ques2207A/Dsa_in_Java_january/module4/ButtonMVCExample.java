package module4;
import javax.swing.*;
import java.awt.event.*;

public class ButtonMVCExample 
{
    public static void main(String[] args) 
    {
        // View (UI)
        JFrame frame = new JFrame("MVC Button Example");
        JButton button = new JButton("Click Me");

        // Controller (Event Handling)
        button.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                // Model + Logic
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Layout (simple for now)
        frame.add(button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

