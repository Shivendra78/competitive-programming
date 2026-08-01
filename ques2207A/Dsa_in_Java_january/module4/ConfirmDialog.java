package module4;

import javax.swing.*;

public class ConfirmDialog 
{
    public static void main(String[] args) 
    {
        int result = JOptionPane.showConfirmDialog(null, "Are you sure?");

        if(result == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "You clicked YES");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You clicked NO");
        }
    }
}