package module4;


import javax.swing.*;

public class InputDialog 
{
    public static void main(String[] args) 
    {
        String name = JOptionPane.showInputDialog("Enter your name");

        JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}