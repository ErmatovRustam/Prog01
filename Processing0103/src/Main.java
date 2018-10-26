import processing.core.PApplet;

import java.util.Random;

public class Main extends PApplet {

    Random rnd = new Random();

    float r = 10;
    float x = 200;
    float dx = 5;
    float y = 500;
    float dy = 5;

    public void settings() {
        size(600 ,600);
    }

    public void draw() {
        background(0, 0, 0);
        fill(255, 0, 0);
        ellipse(x, y, 2*r, 2*r);

        if (x+r > width) {
            dx = -dx;
        }
        else if(x-r < 0) {
            dx = -dx;
        }

        if (y+r >= height) {
            dy = -dy;
        }
        else if(y-r < 0) {
            dy = -dy;
        }

        x += dx;
        y += dy;
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}