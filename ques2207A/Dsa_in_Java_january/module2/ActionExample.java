package module2;

import java.awt.*;
import java.awt.event.*;

public class ActionExample extends Frame implements ActionListener {

    Button b;
    Label l;

    ActionExample() {
        b = new Button("Click");
        l = new Label("Not Clicked");

        b.setBounds(100, 100, 80, 30);
        l.setBounds(100, 150, 100, 30);

        add(b);
        add(l);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked");
    }

    public static void main(String[] args) {
        new ActionExample();
    }
}