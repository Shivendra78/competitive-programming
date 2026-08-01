package clg_prac;

import javax.swing.*;
import java.awt.event.*;


public class prac1 {
    // public static void main(String[] args) {

    //     //View UI
    //     JFrame frame=new JFrame("Button MVc Framework");
    //     JButton button=new JButton("Click me");

    //     button.addActionListener(new ActionListener() {
    //         public void actionPerformed(ActionEvent e){
    //                 JOptionPane.showMessageDialog(frame, "Button was Clicked");
    //         }
    //     });

    //     frame.add(button);
    //     frame.setSize(300,400);
    //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     frame.setVisible(true);
    // }

  public static void main(String[] args) {

    JFrame frame=new JFrame("MVC Button");
    JButton button=new JButton("Click me");

    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(frame, "Button was clicked");
        }
    });

    frame.add(button);
    frame.setSize(300,300);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.setVisible(true);

  }
}
