package module4;

import javax.swing.*;
import java.awt.event.*;

public class ButtonCounterMVC 
{
    public static void main(String[] args) 
    {
        // Model (data)
        final int[] count = {0};

        // View (UI)
        JFrame frame = new JFrame("Counter Example");
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Count: 0");

        // Controller (event handling)
        button.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                count[0]++; // updating model
                label.setText("Count: " + count[0]); // updating view
            }
        });

        // Layout
        frame.setLayout(null);

        button.setBounds(100, 50, 100, 30);
        label.setBounds(100, 100, 150, 30);

        frame.add(button);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}