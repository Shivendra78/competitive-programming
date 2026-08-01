package module2;


import java.awt.*;
import java.awt.event.*;

public class ItemExample extends Frame implements ItemListener {

    Checkbox c;

    ItemExample() {
        c = new Checkbox("Java");

        add(c);

        setSize(300, 300);
        setVisible(true);

        c.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        System.out.println("Checkbox changed");
    }

    public static void main(String[] args) {
        new ItemExample();
    }
}