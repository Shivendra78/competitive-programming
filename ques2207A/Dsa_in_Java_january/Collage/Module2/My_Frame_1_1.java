package Collage.Module2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;       // ActionEvent class import ki (button click ka event handle karne ke liye)
import java.awt.event.ActionListener;    // ActionListener interface import ki
import javax.swing.BorderFactory;        // Border banane ke liye
import javax.swing.ImageIcon;            // Image load karne ke liye
import javax.swing.JButton;             // Button banane ke liye

// JFrame inherit kar rahe hain (window ki tarah behave karega)
// ActionListener implement kar rahe hain (button click detect karne ke liye)
public class My_Frame_1_1 extends JFrame implements ActionListener {

    // Class level pe declare kiya taaki poori class me access ho sake
    JButton button;  // Button object
    JLabel label;    // Label object (image dikhane ke liye)

    // Constructor - jab object create hoga tab automatically run hoga
    My_Frame_1_1() {

        // Button ke upar dikhne wali image load kar rahe hain (full path se)
        ImageIcon icon = new ImageIcon("D:\\Dsa_in_Java_january\\Collage\\Module2\\download.jpg");

        // ===================== BUTTON SETUP =====================

        // Naya button create kiya
        button = new JButton();

        // Button ki position (x=200, y=100) aur size (width=300, height=150) set ki
        button.setBounds(200, 100, 300, 150);

        // Button par dikhne wala text set kiya
        button.setText("I am a button");

        // Focus ring (dotted border) hataya jab button click ho
        button.setFocusable(false);

        // Button par icon (image) set ki
        button.setIcon(icon);

        // Icon aur text ko horizontally center me rakha
        button.setHorizontalAlignment(JButton.CENTER);

        // Icon aur text ko vertically neeche rakha
        button.setVerticalAlignment(JButton.BOTTOM);

        // Button ka font set kiya (Comic Sans, Bold, size 25)
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));

        // Icon aur text ke beech ka gap set kiya (negative matlab overlap karega)
        button.setIconTextGap(-15);

        // Button ke text ka color cyan rakha
        button.setForeground(Color.cyan);

        // Button ka background color red rakha
        button.setBackground(Color.red);

        // Button ke around ek etched (sunken) border lagaya
        button.setBorder(BorderFactory.createEtchedBorder());

        // ActionListener attach kiya - ab jab button click hoga to actionPerformed() call hogi
        button.addActionListener(this);

        // ===================== LABEL SETUP =====================

        // Naya label create kiya
        label = new JLabel();

        // Label ke liye alag image load ki (relative path se)
        ImageIcon icon2 = new ImageIcon("download.png");

        // Image ko label par set kiya
        label.setIcon(icon2);

        // Label ki position (x=150, y=250) aur size (width=150, height=150) set ki
        label.setBounds(150, 250, 150, 150);

        // Shuru me label chhupa ke rakha - button click hone par dikhega
        label.setVisible(false);

        // ===================== FRAME SETUP =====================

        // X button dabane par program band ho jaye
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout null - taaki hum khud x,y se position set kar sake (setBounds use karne ke liye)
        this.setLayout(null);

        // Frame ka size set kiya (width=500, height=500)
        this.setSize(500, 500);

        // Button ko frame me add kiya
        this.add(button);

        // Label ko frame me add kiya
        this.add(label);

        // Frame ko visible kiya - HAMESHA SABSE LAST ME LIKHTE HAIN
        // Pehle sab components add karo, phir visible karo
        this.setVisible(true);
    }

    // Ye method tab call hoti hai jab koi registered component click hota hai
    @Override
    public void actionPerformed(ActionEvent e) {

        // Check karo ki event button se aaya hai ya nahi
        if (e.getSource() == button) {

            // Button click hone par label ko visible kar do
            label.setVisible(true);
        }
    }

    // Program yahin se start hota hai
    public static void main(String[] args) {

        // Object create kiya - isse constructor call hoga aur window khul jayegi
        new My_Frame_1_1();
    }
}