import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    double r = 200;
    double dx;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        strokeWeight(4);
        dx = 1;

    }


    public void draw() {
        drawStar(width / 2, height / 2, 200, 0xFFFF0000);
        drawStar(width / 4, height / 4, 100, 0xFFFFFF00);
        drawStar(3 * width / 4, height / 4, 100, 0xFFFFFF00);
        drawStar(width / 4, 3 * height / 4, 100, 0xFFFFFF00);
        drawStar(3 * width / 4, 3 * height / 4, 100, 0xFFFFFF00);

        r += dx;
        if (r > 500) {
            r -= dx;
        }
        if (r < 10) {
            r += dx;
        }
    }

    void drawStar(float x, int y, float r, int c) {
        pushMatrix();
        translate(x, y);
        stroke(c);
        //- and |
        line(-r, 0, r, 0);
        line(0, -r, 0, r);

        // \ and /
        line(-r / 4, -r / 4, r / 4, r / 4);
        line(-r / 4, r / 4, r / 4, -r / 4);

        // 1
        line(-r / 4, -r / 4, 0, -r);
        line(-r / 4, -r / 4, -r, 0);

        // 2

        line(r / 4, -r / 4, 0, -r);
        line(r / 4, -r / 4, r, 0);

        // 3
        line(r / 4, r / 4, r, 0);
        line(r / 4, r / 4, 0, r);

        // 4
        line(-r / 4, r / 4, 0, r);
        line(-r / 4, r / 4, -r, 0);

        popMatrix();



    }


    public static void main(String... args) {
        PApplet.main("Main");
    }
}