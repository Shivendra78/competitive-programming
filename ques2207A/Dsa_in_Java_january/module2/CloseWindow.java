package module2;


import java.awt.*;
import java.awt.event.*;

public class CloseWindow extends Frame {

    CloseWindow() {
        setSize(300, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new CloseWindow();
    }
}