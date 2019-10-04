package session05;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TODO: 记住这两种写法

public class SampleWin {
    public static void main(String[] args) {
        JButton button = new JButton("hello");
        button.addActionListener(new MyListener());
//        button.addActionListener(
//                new ActionListener() {
//                    public void actionPerformed(ActionEvent e) {
//                        System.out.println("Hello");
//                    }
//                }
//
//        );
    }
}

class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello");
    }
}
