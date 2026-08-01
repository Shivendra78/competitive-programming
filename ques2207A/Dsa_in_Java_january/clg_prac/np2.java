package clg_prac;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import module4.GridLayoutDemo;

public class np2 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Grid layout Example");
         frame.setLayout(new GridLayout(2, 2));

         frame.add(new JButton("1"));
         frame.add(new JButton("2"));
         frame.add(new JButton("3"));
         frame.add(new JButton("4"));
            frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    }

