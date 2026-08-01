package module4;


import javax.swing.*;
import java.awt.event.*;

public class FileChooserDemo 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("File Chooser");

        JButton btn = new JButton("Open File");
        btn.setBounds(100, 100, 120, 30);

        btn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                JFileChooser fc = new JFileChooser();
                int result = fc.showOpenDialog(f);

                if(result == JFileChooser.APPROVE_OPTION)
                {
                    String file = fc.getSelectedFile().getAbsolutePath();
                    JOptionPane.showMessageDialog(f, file);
                }
            }
        });

        f.add(btn);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}