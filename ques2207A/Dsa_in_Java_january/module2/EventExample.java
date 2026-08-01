package module2;
import java.awt.*;
import java.awt.event.*;

public class EventExample extends Frame implements ActionListener {

    Button b;

    EventExample() {
        b = new Button("Click Me");

        b.setBounds(100, 100, 80, 30);

        add(b);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        // Register listener
        b.addActionListener(this);
    }

    // Handle event
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");
    }

    public static void main(String[] args) {
        new EventExample();
    }
}