package Collage.Module2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class st {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI"); // 1. Create the Window
        JButton button = new JButton("Submit");   // 2. Create the Button
        frame.add(button);                        // 3. Put the Button inside the Window
    }
}
