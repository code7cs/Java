package session04;

import javax.swing.*;
import java.awt.*;

public class Win1 extends JFrame {
    public Win1(Color fg, Color bg) {
        this.setSize(600, 400);
        Container c = getContentPane();
        c.setBackground(bg);
        c.setForeground(fg);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
//        javax.swing.JFrame frame = new javax.swing.JFrame("hello");
        new Win1(Color.BLACK, Color.RED);
        new Win1(Color.WHITE, Color.BLUE);

    }
}
