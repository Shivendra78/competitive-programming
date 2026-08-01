package clg_prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class np {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Addition GUI");
    
        frame.setLayout(new FlowLayout());
        //InputField
        JTextField t1=new JTextField(10);
        JTextField t2=new JTextField(10);
        
        //button
        JButton btn=new JButton("Add");

        JLabel result=new JLabel("Result: ");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                   int num1=Integer.parseInt(t1.getText());
                   int num2=Integer.parseInt(t2.getText());

                   int sum=num1+num2;

                   result.setText("Result: "+sum);
                }catch(Exception ex){
                    result.setText("Enter the valid number");
                }
            }
        });

        frame.add(new JLabel("Enter the First Number: "));
        frame.add(t1);
        frame.add(new JLabel("Enter the second NUmber"));
        frame.add(t2);
        frame.add(btn);
        frame.add(result);

        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
}
