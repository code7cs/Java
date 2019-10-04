package session04;

/*
    HW5a - Java - Calculator
    Author: Hanfan Wang
    CWID: 10442733
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyCalculator extends JFrame implements ActionListener {

    private static JTextField text_field;

    private String s0, s1, s2;

    private MyCalculator() {
        s0 = s1 = s2 = "";
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("calculator");

        MyCalculator c = new MyCalculator();

        text_field = new JTextField(18);
        text_field.setEditable(false);

        ArrayList<JButton> btns = new ArrayList<>();
        for (char num = '0'; num <= '9'; num++) {
            btns.add(new JButton(String.valueOf(num)));
        }
        JButton b_add, b_sub, b_mul, b_div, b_dot, b_clear, b_equal;
        b_add = new JButton("+");
        b_sub = new JButton("-");
        b_mul = new JButton("*");
        b_div = new JButton("/");
        b_dot = new JButton(".");
        b_clear = new JButton("C");
        b_equal = new JButton("=");

        for (int num = 0; num <= 9; num++) {
            btns.get(num).addActionListener(c);
        }
        b_add.addActionListener(c);
        b_sub.addActionListener(c);
        b_mul.addActionListener(c);
        b_div.addActionListener(c);
        b_dot.addActionListener(c);
        b_clear.addActionListener(c);
        b_equal.addActionListener(c);


        JPanel p = new JPanel();

        p.add(text_field);
        p.add(b_clear);
        p.add(btns.get(7));
        p.add(btns.get(8));
        p.add(btns.get(9));
        p.add(b_add);
        p.add(btns.get(4));
        p.add(btns.get(5));
        p.add(btns.get(6));
        p.add(b_sub);
        p.add(btns.get(1));
        p.add(btns.get(2));
        p.add(btns.get(3));
        p.add(b_mul);
        p.add(b_dot);
        p.add(btns.get(0));
        p.add(b_equal);
        p.add(b_div);

        p.setBackground(Color.gray);

        f.add(p);
        f.setTitle("MyCalculator");
        f.setSize(350, 240);
        f.show();
    }

    private static double operator(String s0, String s1, String s2) {
        if (s1.equals("+")) {
            return Double.parseDouble(s0) + Double.parseDouble(s2);
        } else if (s1.equals("-")) {
            return Double.parseDouble(s0) - Double.parseDouble(s2);
        } else if (s1.equals("*")) {
            return Double.parseDouble(s0) * Double.parseDouble(s2);
        } else {
            return Double.parseDouble(s0) / Double.parseDouble(s2);
        }
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.charAt(0) == 'C') {
            s0 = s1 = s2 = "";
            text_field.setText(s0 + s1 + s2);
        } else if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!s1.equals("")) {
                s2 += s;
            } else {
                s0 += s;
            }
            text_field.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == '=') {
            text_field.setText(s0 + s1 + s2 + "=" + operator(s0, s1, s2));
            s0 = Double.toString(operator(s0, s1, s2));
            s1 = s2 = "";
        } else {
            if (s1.equals("") || s2.equals("")) {
                s1 = s;
                System.out.println(s1);
            } else {
                s0 = Double.toString(operator(s0, s1, s2));
                System.out.println("s0" + s0);
                s1 = s;
                System.out.println("s1: " + s1);
                System.out.println("s2: " + s2);
                s2 = "";
            }
            text_field.setText(s0 + s1 + s2);
        }
    }
}

