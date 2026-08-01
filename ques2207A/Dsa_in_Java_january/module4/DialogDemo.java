package module4;

import javax.swing.*;

public class DialogDemo 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame();

        JOptionPane.showMessageDialog(f, "Hello Shivani!");

        f.setSize(300,200);
        f.setVisible(true);
    }
}