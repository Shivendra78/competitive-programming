package Collage.Module2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main_Jpanel {
    //Jpanel=a GUI component that functions as a container to hold other component
    public static void main(String[] args) {
        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setLayout(new BorderLayout());


        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);    
        redPanel.setBounds(0, 0, 250, 250);
        frame.add(redPanel);

        //we create different section also to carry different thingd
         JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        frame.add(bluePanel);

         JPanel blackPanel=new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(250, 250, 250, 250);
        frame.add(blackPanel);
        
         JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 250, 250);
        frame.add(greenPanel);
        greenPanel.setLayout(new BorderLayout());

        JLabel label=new JLabel();
        label.setText("Hii Shivam");
        ImageIcon icon =new ImageIcon("D:\\Dsa_in_Java_january\\Collage\\Module2\\download.jpg");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);

        redPanel.add(label);

        
    }





}
