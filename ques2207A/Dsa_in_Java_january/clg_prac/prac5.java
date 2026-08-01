package clg_prac;

import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class prac5 {
    public static void main(String[] args) {
        JFrame f=new JFrame("CheckBox Menu ");

        JMenuBar mb=new JMenuBar();

        JMenu menu=new JMenu("Options");

        JCheckBoxMenuItem bold=new JCheckBoxMenuItem("bold");
        JCheckBoxMenuItem italic=new JCheckBoxMenuItem("italic"); 

        menu.add(bold);
        menu.add(italic);

        mb.add(menu);
        f.setJMenuBar(mb);

        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
