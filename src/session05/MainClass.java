package session05;

import processing.core.PApplet;

public class MainClass extends PApplet {
    public void settings() {
        size(1000, 1000);
    }

    public void draw() {
        line(0, 0, 200, 200);
    }

    public static void main(String[] args) {
        PApplet.main("session05.MainClass", args);
    }
}
