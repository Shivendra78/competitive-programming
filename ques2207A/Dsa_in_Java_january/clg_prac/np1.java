package clg_prac;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class np1 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Addition GUI");

        //Input TextFileds

        JTextField t1=new JTextField(10);
        JTextField t2=new JTextField(10);

        //btn

        JButton btn=new JButton("Add");

        frame.setLayout(new FlowLayout());
        JLabel result=new JLabel("Result: ");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    int num1=Integer.parseInt(t1.getText());
                    int num2=Integer.parseInt(t2.getText());

                    int sum=num1+num2;

                    result.setText("result: "+sum);
                }catch(Exception ex){
                    result.setText("Enter valid number");
                }
            }
        });

        frame.add( new JLabel("Enter the num1"));
        frame.add(t1);
        frame.add(new JLabel("Enter the num2"));
        frame.add(t2);

        frame.add(btn);
        frame.add(result);

        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
