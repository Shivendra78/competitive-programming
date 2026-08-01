package clg_prac;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class gridAddition {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Grid Addition using Layout");

        frame.setLayout(new GridLayout(4,2));
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();

        JButton btn=new JButton("Add");

        JLabel result=new JLabel("Results: ");

       btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int sum=num1+num2;

                result.setText("result: "+sum);
            }
       });

       frame.add(new JLabel("First NUmber: "));
       frame.add(t1);
       frame.add(new JLabel("Second NUmber"));
       frame.add(t2);

       frame.add(btn);
       frame.add(result);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
