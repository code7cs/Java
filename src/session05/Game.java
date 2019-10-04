package session05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Game extends JFrame {
    private void buildMenus() {
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("File");
        JMenuItem mi = new JMenuItem("New");
        m.add(mi);
        mi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        mi = new JMenuItem("Quit");
        mi.addActionListener(
                new ActionListener() {  // session05.Game$1
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
        );
        m.add(mi);
        mb.add(m);
        setJMenuBar(mb);
    }

    public Game() {
        super("Chess");
        setSize(800, 800);
        buildMenus();
        GameBoard b = new GameBoard();
        b.setBackground(Color.red);
        Container c = getContentPane();
        c.add(BorderLayout.CENTER, b);
        setVisible(true);
    }


    public static void main(String[] args) {
        Game g = new Game();
    }
}

class GameBoard extends JPanel {
    private int board[][];

    public GameBoard() {
        board = new int[8][8];
        board[0][0] = 1;
        board[0][1] = 2;
        MoveListener m = new MoveListener();
        addMouseListener(m);
        addMouseMotionListener(m);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(0, 0, 300, 300);
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if (board[i][j] != 0) {
                    g.setColor(board[i][j] == 1 ? Color.BLACK : Color.WHITE);
                    g.fillOval(i * 100, j * 100, 50, 50);
                }
    }

    private class MoveListener implements MouseListener, MouseMotionListener {
        private int lastX, lastY;

        @Override
        public void mousePressed(MouseEvent e) {
            Graphics g = getGraphics(); //session05.GameBoard.this.getGraphics()
            g.setXORMode(Color.WHITE);
//GRID SNAP            int x = e.getX() / 100 * 100;
            g.drawOval(e.getX(), e.getY(), 50, 50);
            lastX = e.getX();
            lastY = e.getY();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            Graphics g = getGraphics();
            g.setXORMode(Color.WHITE);
            g.drawOval(lastX, lastY, 50, 50);

            g.drawOval(e.getX(), e.getY(), 50, 50);
            lastX = e.getX();
            lastY = e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

        @Override
        public void mouseMoved(MouseEvent me) {
        }

        @Override
        public void mouseClicked(MouseEvent me) {
        }

    }

}


//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class session05.Game extends JFrame {
//    private void buildMenus() {
//        JMenuBar menuBar = new JMenuBar();
//        JMenu menu = new JMenu("File");
//        JMenuItem menuItem = new JMenuItem("New");
//        menu.add(menuItem);
//        menuItem.addActionListener(
//                new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        System.out.println("Hello");
//                    }
//                }
//        );
//        menuItem = new JMenuItem("Quit");
//        menuItem.addActionListener(
//                new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        System.exit(0);
//                    }
//                }
//        );
//        menu.add(menuItem);
//        menuBar.add(menu);
//        setJMenuBar(menuBar);
//    }
//
//    public session05.Game() {
//        super("Chess");
//        setSize(800, 800);
//        buildMenus();
//        session05.GameBoard b = new session05.GameBoard();
//        b.setBackground(Color.red);
//        Container c = getContentPane();
//
//        c.add(BorderLayout.CENTER, b);
//        setVisible(true);
//
//    }
//
//
//    public static void main(String[] args) {
//        session05.Game game = new session05.Game();
//    }
//}
//
//class session05.GameBoard extends JPanel {
//    private int board[][];
//
//    public session05.GameBoard() {
//        board = new int[8][8];
//        board[0][0] = 1;
//        board[0][1] = 2;
//
//        MoveListener m = new MoveListener();
//        addMouseListener(m);
//        addMouseMotionListener(m);
//
//    }
//
//    public void paint(Graphics g) {
//        super.paint(g);
////        g.clearRect();
//        g.drawLine(0, 0, 300, 300);
////        g.drawImage()
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (board[i][j] != 0) {
//                    if (board[i][j] == 1) {
//                        g.setColor(Color.BLACK);
//                        g.fillOval(i * 100, j * 100, 50, 50);
//                    } else if (board[i][j] == 2) {
//                        g.setColor(Color.WHITE);
//                        g.fillOval(i * 100, j * 100, 50, 50);
//                    }
//                }
//            }
//        }
//    }
//
//    private class MoveListener implements MouseListener, MouseMotionListener {
//        private int lastX, lastY;
//
//        @Override
//        public void mouseClicked(MouseEvent me) {
//
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//            Graphics g = getGraphics(); // session05.GameBoard.this.getGraphics()
//// Grid Snap            int x = e.getX() / 100 * 100;
//            g.drawOval(e.getX(), e.getY(), 50, 50);
//            lastX = e.getX();
//            lastY = e.getY();
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent me) {
//            // remove the piece from the original board location
//            // add to the new location
//            // board[i][j] = ...
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent me) {
//
//        }
//
//        @Override
//        public void mouseExited(MouseEvent me) {
//
//        }
//
//        @Override
//        public void mouseDragged(MouseEvent e) {
//            Graphics g = getGraphics();
//            g.setXORMode(Color.WHITE);
//            g.drawOval(lastX, lastY, 50, 50);
//            g.drawOval(e.getX(), e.getY(), 50, 50);
//            lastX = e.getX();
//            lastY = e.getY();
//        }
//
//        @Override
//        public void mouseMoved(MouseEvent me) {
//
//        }
//    }
//
//}
//
