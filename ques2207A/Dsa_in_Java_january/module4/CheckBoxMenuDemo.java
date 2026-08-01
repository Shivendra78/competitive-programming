package module4;

import javax.swing.*;

public class CheckBoxMenuDemo 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("CheckBox Menu");

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Options");

        JCheckBoxMenuItem bold = new JCheckBoxMenuItem("Bold");
        JCheckBoxMenuItem italic = new JCheckBoxMenuItem("Italic");

        menu.add(bold);
        menu.add(italic);

        mb.add(menu);
        f.setJMenuBar(mb);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}