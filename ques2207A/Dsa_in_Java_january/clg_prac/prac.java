package clg_prac;

import javax.swing.*;
import java.awt.event.*;

public class prac {
    // public static void main(String[] args) {
    //     final  int[] count={0};
    //     JFrame frame=new JFrame("Button Click Ocunter");
    //     JButton button=new JButton("CLick me");
    //     JLabel label=new JLabel("Count: 0");

    //     button.addActionListener(new ActionListener() {
    //         public void actionPerfromed(ActionEvent e){
    //             count[0]++;
    //             label.setText("Count: "+count[0]++);
    //         }

    //         @Override
    //         public void actionPerformed(ActionEvent e) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    //         }
    //     });

    //     button.setBounds(50,100,120,140);
    //     label.setBounds(50,100,120,140);
        

    //     frame.setVisible(true);
    //     frame.add(button);
    //     frame.setLayout(null);
    //     frame.setSize(300,300);
    //     frame.add(label);
    //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Buttion Click Counter");
        JButton button=new JButton("Click me");
        JLabel label=new JLabel("Count: 0");
        final int[] count={0};

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                count[0]++;
                label.setText("Count: "+count[0]++);
            }
        });

        frame.setLayout(null);
        
       button.setBounds(100,50,120,50);
       label.setBounds(100, 120, 120, 30);

        frame.add(button);
        frame.add(label);
        
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
