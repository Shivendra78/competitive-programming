package module4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridAddition 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Addition using GridLayout");

        frame.setLayout(new GridLayout(4, 2));

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton btn = new JButton("Add");
        JLabel result = new JLabel("Result: ");

        btn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());

                result.setText("Result: " + (num1 + num2));
            }
        });

        frame.add(new JLabel("First Number:"));
        frame.add(t1);
        frame.add(new JLabel("Second Number:"));
        frame.add(t2);
        frame.add(btn);
        frame.add(result);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}