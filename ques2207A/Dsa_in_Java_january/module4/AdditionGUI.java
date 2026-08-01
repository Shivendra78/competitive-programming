package module4;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionGUI 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Addition Example");

        frame.setLayout(new FlowLayout());

        // Input fields
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);

        // Button
        JButton btn = new JButton("Add");

        // Result label
        JLabel result = new JLabel("Result: ");

        // Controller (event handling)
        btn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());

                    int sum = num1 + num2;

                    result.setText("Result: " + sum);
                } 
                catch (Exception ex) 
                {
                    result.setText("Enter valid numbers!");
                }
            }
        });

        // Add components
        frame.add(new JLabel("Enter First Number:"));
        frame.add(t1);
        frame.add(new JLabel("Enter Second Number:"));
        frame.add(t2);
        frame.add(btn);
        frame.add(result);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}