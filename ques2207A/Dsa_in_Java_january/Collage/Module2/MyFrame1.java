package Collage.Module2;
// JButton

// Import JFrame class (window banane ke liye)
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
// Import JButton class (button banane ke liye)
import javax.swing.JButton;

// Import ActionListener (button click event handle karne ke liye)
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Class MyFrame1 JFrame ko extend kar rahi hai
// aur ActionListener implement kar rahi hai
public class MyFrame1 extends JFrame implements ActionListener {

    // JButton object declare kiya
    JButton button;
    JLabel label;
    // Constructor (jab object create hota hai tab ye run hota hai)
    MyFrame1() {

        label=new JLabel();
        ImageIcon icon2=new ImageIcon("download.png");
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(true);
        this.add(button);
        this.add(label);



        // Button create kiya with text
        button = new JButton("Click Me");

        // Button ki position aur size set ki
        button.setBounds(200, 100, 100, 50);

        // Button ko action listener se connect kiya
        button.addActionListener(this);

        // Close button pe click karne par program band ho
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout null rakha taaki manually position set kar sake
        this.setLayout(null);

        // Frame ka size set kiya
        this.setSize(500, 500);

        // Button ko frame me add kiya
        this.add(button);

        // Frame ko visible kiya
        this.setVisible(true);
    }

    // Ye method tab call hota hai jab button click hota hai
    @Override
    public void actionPerformed(ActionEvent e) {

        // Check kar rahe hain ki button hi click hua hai ya nahi
        if (e.getSource() == button) {

            // Console me print karega
            // System.out.println("poo");
            label.setVisible(true);
        }
        // button.setEnabled(false);

    }

    // Main method (program yahin se start hota hai)
    public static void main(String[] args) {

        // Object create kiya
        new MyFrame1();
    }
}