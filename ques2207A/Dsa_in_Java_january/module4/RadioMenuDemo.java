package module4;


import javax.swing.*;

public class RadioMenuDemo 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Radio Menu");

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Mode");

        JRadioButtonMenuItem light = new JRadioButtonMenuItem("Light");
        JRadioButtonMenuItem dark = new JRadioButtonMenuItem("Dark");

        ButtonGroup bg = new ButtonGroup();
        bg.add(light);
        bg.add(dark);

        menu.add(light);
        menu.add(dark);

        mb.add(menu);
        f.setJMenuBar(mb);

        f.setSize(300, 200);
        f.setVisible(true);
    }
}