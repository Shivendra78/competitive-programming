package module4;

import javax.swing.*;
import java.awt.*;

public class GridBagDemo 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        // Button 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JButton("A"), gbc);

        // Button 2
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(new JButton("B"), gbc);

        // Button 3 (span 2 columns)
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(new JButton("C"), gbc);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}