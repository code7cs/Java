package practiceMid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    private JButton b1;
    private JButton b2;

    public Test() {
        this.setSize(600, 400);
        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b1.setOpaque(true);
        Container c = getContentPane();
        b1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("hello");
                    }
                }
        );
        Inner inner = new Inner();
        inner.show();
        c.add(BorderLayout.WEST, b1);
        this.setVisible(true);
    }

    // 内部类可以直接访问外部类的元素，但是外部类不可以直接访问内部类的元素，可以通过新建内部类引用访问 !!!
    public class Inner {
        public void show() {
            b1.setBackground(Color.red);
        }
    }

    public static void main(String[] args) {
        new Test();
    }
}
