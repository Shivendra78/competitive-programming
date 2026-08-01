package module4;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextComponentsDemo 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Text Components Example");

        frame.setLayout(new FlowLayout());

        // TextField
        JTextField nameField = new JTextField(15);

        // PasswordField
        JPasswordField passField = new JPasswordField(15);

        // TextArea
        JTextArea area = new JTextArea(5, 20);

        // ScrollPane
        JScrollPane scroll = new JScrollPane(area);

        JButton btn = new JButton("Submit");
        JLabel result = new JLabel("");

        btn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String name = nameField.getText();
                String pass = new String(passField.getPassword());
                String msg = area.getText();

                result.setText("Hello " + name);
            }
        });

        frame.add(new JLabel("Name:"));
        frame.add(nameField);

        frame.add(new JLabel("Password:"));
        frame.add(passField);

        frame.add(new JLabel("Message:"));
        frame.add(scroll);

        frame.add(btn);
        frame.add(result);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}