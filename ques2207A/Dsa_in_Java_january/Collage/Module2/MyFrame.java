package Collage.Module2;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame title goes here");//sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        // frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Hide of application
        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //do noting out of application
        this.setSize(420,420); //sets the dimension and y dimension of frame

        this.setVisible(true); //MAke the frame Visible

        // frame.setResizable(false);//Prevent frame from being resized

        ImageIcon image=new ImageIcon("D:\\Dsa_in_Java_january\\Collage\\Module2\\shivendra_photo.jpeg"); //create an ImageIcon
        this.setIconImage(image.getImage());//change icon of frame
         
        this.getContentPane().setBackground(new Color(0,0,0)); //Change the color of the background

    }
    public static void main(String[] args) {
        MyFrame myFrame=new MyFrame();
    }
}
