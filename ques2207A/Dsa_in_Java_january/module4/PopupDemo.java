package module4;


import javax.swing.*;
import java.awt.event.*;

public class PopupDemo 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Popup Menu");

        JPopupMenu popup = new JPopupMenu();

        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");

        popup.add(cut);
        popup.add(copy);

        f.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                if (e.getButton() == MouseEvent.BUTTON3) 
                {
                    popup.show(f, e.getX(), e.getY());
                }
            }
        });

        f.setSize(300, 200);
        f.setVisible(true);
    }
}