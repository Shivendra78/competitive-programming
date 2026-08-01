package clg_prac;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class prac2 {
    // public static void main(String[] args) {
    //     JFrame frame=new JFrame("Java Border Layout Example");
    //     frame.setLayout(new BorderLayout());

    //     frame.add(new JButton("North"),BorderLayout.NORTH);
    //     frame.add(new JButton("Centre"),BorderLayout.CENTER);
    //     frame.add(new JButton("East"),BorderLayout.EAST);
    //     frame.add(new JButton("West"),BorderLayout.WEST);
    //     frame.add(new JButton("South"),BorderLayout.SOUTH);

    //     frame.setVisible(true);
    //     frame.setSize(300,400);
    //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    // }

        public static void main(String[] args) {
            JFrame frame=new JFrame("Set Border Layout");

            frame.setLayout(new BorderLayout());

            frame.add(new JButton("South"),BorderLayout.SOUTH);

            frame.add(new JButton("North"),BorderLayout.NORTH);

            frame.add(new JButton("East"),BorderLayout.EAST);

            frame.add(new JButton("CEntre"),BorderLayout.CENTER);








            frame.setVisible(true);
            frame.setSize(300,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
}
