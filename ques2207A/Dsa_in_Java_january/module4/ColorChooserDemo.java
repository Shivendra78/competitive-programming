package module4;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserDemo 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Color Chooser");

        JButton btn = new JButton("Pick Color");
        btn.setBounds(100, 100, 120, 30);

        btn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                Color c = JColorChooser.showDialog(f, "Select Color", Color.WHITE);
                f.getContentPane().setBackground(c);
            }
        });

        f.add(btn);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}