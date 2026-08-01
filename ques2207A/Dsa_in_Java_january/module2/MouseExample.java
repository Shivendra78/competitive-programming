package module2;


import java.awt.*;
import java.awt.event.*;

public class MouseExample extends Frame implements MouseListener {

    Label l;

    MouseExample() {
        l = new Label("Click anywhere");

        add(l);

        setSize(300, 300);
        setVisible(true);

        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked!");
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseExample();
    }
}