package Collage.Module2;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        //Jframe is a GUI window to add components to
        //First way to do things

        JFrame frame=new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here");//sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        // frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Hide of application
        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //do noting out of application
        frame.setSize(420,420); //sets the dimension and y dimension of frame

        frame.setVisible(true); //MAke the frame Visible

        // frame.setResizable(false);//Prevent frame from being resized

        ImageIcon image=new ImageIcon("D:\\Dsa_in_Java_january\\Collage\\Module2\\shivendra_photo.jpeg"); //create an ImageIcon
        frame.setIconImage(image.getImage());//change icon of frame
         
        frame.getContentPane().setBackground(new Color(0,0,0)); //Change the color of the background

    }
}
