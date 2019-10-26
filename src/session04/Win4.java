package session04;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Win4 extends JFrame {
    /**
     * @param fg Foreground color
     * @param bg Background color
     * @param w  width of the window
     * @param h  height of the window
     */
    public Win4(Color fg, Color bg, int w, int h) {
        this.setSize(w, h);
        Container c = getContentPane();
        c.setBackground(bg);
        c.setForeground(fg);


        JButton b = new JButton("testing");
        c.add(BorderLayout.WEST, b);

        b = new JButton("ok");
        c.add(BorderLayout.NORTH, b);


        JPanel p = new JPanel();
        p.setBackground(new Color(205, 0, 150));
//        c.add(BorderLayout.CENTER, p);

        p.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 16; i++) {
            b = new JButton(i + "");
            p.add(b);
        }


        JPanel p2 = new JPanel();
        p2.setBackground(new Color(250, 200, 100));
        c.add(BorderLayout.CENTER, p2);

        p2.setLayout(new GridLayout(3, 1));
        p2.add(p);

        JTextArea t2 = new JTextArea();
        p2.add(t2);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
//        javax.swing.JFrame frame = new javax.swing.JFrame("hello");
        new Win4(Color.BLACK, Color.RED, 1000, 600);
//        new Win4(Color.WHITE, Color.BLUE, 1000, 600);

    }
}
