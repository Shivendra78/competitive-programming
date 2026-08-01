package module2;


import java.awt.*;
import java.awt.event.*;

public class KeyExample extends Frame implements KeyListener {

    Label l;

    KeyExample() {
        l = new Label("Press any key");

        add(l);

        setSize(300, 300);
        setVisible(true);

        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyExample();
    }
}