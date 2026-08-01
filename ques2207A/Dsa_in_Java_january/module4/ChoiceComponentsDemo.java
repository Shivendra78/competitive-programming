package module4;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChoiceComponentsDemo 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Choice Components");

        frame.setLayout(new FlowLayout());

        // CheckBox
        JCheckBox cb1 = new JCheckBox("Java");
        JCheckBox cb2 = new JCheckBox("Python");

        // Radio Buttons
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // ComboBox
        String[] cities = {"Indore", "Bhopal", "Delhi"};
        JComboBox<String> combo = new JComboBox<>(cities);

        JButton btn = new JButton("Submit");
        JLabel result = new JLabel("");

        btn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String msg = "";

                // Checkbox
                if (cb1.isSelected()) msg += "Java ";
                if (cb2.isSelected()) msg += "Python ";

                // Radio
                if (r1.isSelected()) msg += "Male ";
                if (r2.isSelected()) msg += "Female ";

                // Combo
                msg += combo.getSelectedItem();

                result.setText(msg);
            }
        });

        frame.add(new JLabel("Select Language:"));
        frame.add(cb1);
        frame.add(cb2);

        frame.add(new JLabel("Gender:"));
        frame.add(r1);
        frame.add(r2);

        frame.add(new JLabel("City:"));
        frame.add(combo);

        frame.add(btn);
        frame.add(result);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}