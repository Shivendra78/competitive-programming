package clg_prac;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;


public class prac4 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Menu Example");

        //MenuBar
        JMenuBar mb=new JMenuBar();

        JMenu file=new JMenu("File");

        JMenuItem open=new JMenuItem("Open");
        JMenuItem  about=new JMenuItem("About");
        JMenuItem exit=new JMenuItem("exit");

        file.add(open);
        file.add(about);
        file.add(exit);

        mb.add(file);
        frame.setJMenuBar(mb);

        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Open clicked");
            }
        });

        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "This is Menu Demo");
            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Exit Button was clicked");
            }
        });

        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
