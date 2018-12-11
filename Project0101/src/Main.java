import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static String name;

    float x;
    float y;
    float dx;
    float r = 200 ;
    float r1 = 100;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2;
        y = height / 2;
        frameRate(100);
        strokeWeight(5);
        dx = 5;
    }


    public void draw() {
        background(0);
// - and |
        stroke(155, 155, 0);

        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        // \ and /
        line(x - r / 4, y - r / 4, x + r / 4, y + r / 4);
        line(x - r / 4, y + r / 4, x + r / 4, y - r / 4);
        // ^
        line(x - r / 4, y - r / 4, x, y - r);
        line(x, y - r, x + r / 4, y - r / 4);
        // >
        line(x + r / 4, y - r / 4, x + r, y);
        line(x + r, y, x + r / 4, y + r / 4);
        // v
        line(x + r / 4, y + r / 4, x, y + r);
        line(x, y + r, x - r / 4, y + r / 4);
        //<
        line(x - r / 4, y + r / 4, x - r, y);
        line(x - r, y, x - r / 4, y - r / 4);



        pushMatrix();

        translate(width / 4, height / 4);
        line(x - r - 50, y -50, x + r -50, y -50);
        line(x - 50, y - r - 50, x -50, y + r -50);
        line(x - r / 4 - 50, y - r / 4 - 50, x + r / 4 - 50, y + r / 4 - 50);
        line(x - r / 4 - 50, y + r / 4 - 50, x + r / 4 - 50, y - r / 4 - 50);
        line(x - r / 4 - 50, y - r / 4 - 50, x - 50, y - r - 50);
        line(x - 50, y - r -50, x + r / 4 -50, y - r / 4 -50);
        line(x + r / 4 -50, y - r / 4 -50, x + r -50, y - 50);
        line(x + r -50, y - 50, x + r / 4 -50, y + r / 4 -50);
        popMatrix();

        pushMatrix();
        translate(width / 4, - height / 4);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        popMatrix();

        pushMatrix();
        translate(-width / 4,  height / 4);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        popMatrix();

        pushMatrix();
        translate(- width / 4, - height / 4);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        popMatrix();

        r += dx;
        if (r > 300) {
            r = 300;
            dx = -dx;
        }
        if (r < 100) {
            r = 100;
            dx = -dx;
        }



    }

    public static void main(String... args) {
        //  name = JOptionPane.showInputDialog("Name: ");
        PApplet.main("Main");
    }
}