package session06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest extends JFrame {
    private JTextField t;

    public ButtonTest() {
        this.setSize(600,400);
        JButton b = new JButton("ok");
        t = new JTextField();

        Container c = getContentPane();
//        getContentPane().add(BorderLayout.NORTH, t);
        c.add(BorderLayout.NORTH, t);
        c.add(BorderLayout.SOUTH, b);
        b.addActionListener(
                new ActionListener() { // ButtonTest$1
                    @Override
                    public void actionPerformed(ActionEvent e) {
//                        t.setText(t.getText() + "hello!");
                        int count = Integer.parseInt(t.getText());
                        t.setText(count + 1 + "");
                    }
                }
        );
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonTest();
    }
}
