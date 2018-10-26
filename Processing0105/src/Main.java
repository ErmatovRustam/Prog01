import processing.core.PApplet;

public class Main extends PApplet {
    float x = 0 ;
    float y = 0 ;
    float dx = 10;
    float dy = 10;


    public void settings() {
        size(600, 600);
    }



    public void draw() {
        background(0, 0, 0);
        fill(255, 0, 0);
        ellipse(x, y, 70, 70);

        x += dx;


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

    }


    public static void main(String... args) {
        PApplet.main("Main");
    }
}