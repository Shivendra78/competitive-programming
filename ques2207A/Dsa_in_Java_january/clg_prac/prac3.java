package clg_prac;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.*;




public class prac3 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Border Layout Real Example");

        frame.setLayout(new BorderLayout());

        JLabel title=new JLabel("Wwlcome to my app",JLabel.CENTER);
        frame.add(title,BorderLayout.NORTH);

        JButton submit=new JButton("Submit");
        frame.add(submit,BorderLayout.SOUTH);

        JButton menu=new JButton("Menu");
        frame.add(menu,BorderLayout.WEST);

        JButton exit=new JButton("Exit");
        frame.add(exit,BorderLayout.EAST);

        JTextArea textArea=new JTextArea("Write your text...");
        frame.add(textArea,BorderLayout.CENTER);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);





    }
}
