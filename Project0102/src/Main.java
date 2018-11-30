import processing.core.PApplet;

import java.util.Random;

public class Main extends PApplet {


    float x = 300;
    float y = 300;
    float dx = 10;
    float dy = 10;

    float xA = 250;
    float yA = 250;
    float dxA = 10;
    float dyA = 10;

    float xB = 200;
    float yB = 200;
    float dxB = 10;
    float dyB = 10;


    public void settings() {
        fullScreen();
    }


    public void draw() {
        background(0, 0, 0);
        fill(255, 0, 0);
        ellipse(x, y, 20, 20);

        fill(255, 250, 0);
        ellipse(xA, yA, 20, 20);

        fill(255, 250, 250);
        ellipse(xB, yB, 20, 20);


        x += dx;
        xA += dxA;
        xB += dxB;


        if (x >= width) {
            dx = -dx;
        } else if (x < 0) {
            dx = -dx;
        }
        y += dy;
        if (y >= height) {
            dy = -dy;
        } else if (y < 0) {
            dy = -dy;
        }


        if (xA >= width) {
            dxA = -dxA;
        } else if (xA < 0) {
            dxA = -dxA;
        }
        yA += dyA;
        if (yA >= height) {
            dyA = -dyA;
        } else if (yA < 0) {
            dyA = -dyA;
        }


        if (xB >= width) {
            dxB = -dxB;
        } else if (xB < 0) {
            dxB = -dxB;
        }
        yB += dyB;
        if (yB >= height) {
            dyB = -dyB;
        } else if (yB < 0) {
            dyB = -dyB;
        }

    }


    public static void main(String... args) {
        PApplet.main("Main");
    }
}