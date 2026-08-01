package module4;

import javax.swing.*;
import java.awt.event.*;

public class MixedDemo 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Mixed Components");

        // Labels
        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 50, 100, 30);

        // TextField
        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);

        // Checkbox
        JCheckBox c1 = new JCheckBox("Java");
        JCheckBox c2 = new JCheckBox("Python");
        c1.setBounds(50, 100, 100, 30);
        c2.setBounds(150, 100, 100, 30);

        // Radio Buttons
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        r1.setBounds(50, 150, 100, 30);
        r2.setBounds(150, 150, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // ComboBox
        String city[] = {"Bhopal", "Delhi", "Mumbai"};
        JComboBox cb = new JComboBox(city);
        cb.setBounds(50, 200, 150, 30);

        // Button
        JButton btn = new JButton("Submit");
        btn.setBounds(100, 250, 100, 30);

        // Button Action
        btn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String name = t1.getText();

                String course = "";
                if(c1.isSelected()) course += "Java ";
                if(c2.isSelected()) course += "Python ";

                String gender = "";
                if(r1.isSelected()) gender = "Male";
                if(r2.isSelected()) gender = "Female";

                String city = cb.getSelectedItem().toString();

                JOptionPane.showMessageDialog(f,
                        "Name: " + name +
                        "\nCourse: " + course +
                        "\nGender: " + gender +
                        "\nCity: " + city);
            }
        });

        // MENU
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");

        JMenuItem i1 = new JMenuItem("Exit");
        i1.setMnemonic('E');
        i1.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));

        i1.addActionListener(e -> System.exit(0));

        menu.add(i1);
        mb.add(menu);

        f.setJMenuBar(mb);

        // Add components
        f.add(l1); f.add(t1);
        f.add(c1); f.add(c2);
        f.add(r1); f.add(r2);
        f.add(cb); f.add(btn);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}