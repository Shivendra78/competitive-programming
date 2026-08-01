package Collage.Module2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main1 {
    public static void main(String[] args) {
        //Jlabel=a GUI display area for a string of text,an image,or both

        JLabel label=new JLabel();//creates a label
        label.setText("Bro do you even code? "); //set text of label

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);//to add level
       
        ImageIcon image=new ImageIcon("D:\\Dsa_in_Java_january\\Collage\\Module2\\shivendra_photo.jpeg");
        label.setIcon(image); //set an image to the right of the window
        label.setHorizontalTextPosition(label.CENTER);//set text centre ,left right of imageIcon
        label.setVerticalTextPosition(JLabel.TOP);//set text top centre or botton of image icon

        label.setForeground(new Color(0x00FF00));

        label.setFont(new Font("MV Boli",Font.PLAIN,90));//set the font style of a text

        label.setIconTextGap(100);//set gap of text to image
        label.setBackground(Color.green);//set Background Color
        label.setOpaque(true); //display background color

        //Border

        Border border=BorderFactory.createLineBorder(Color.black,3);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set Horizontal position icon +text within label
        // frame.setLayout(null);
        // label.setBounds(100, 100, 350, 350);//set x and y position within frame as well as dimension
        frame.pack();
    }
}
