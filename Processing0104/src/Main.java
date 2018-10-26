import processing.core.PApplet;

public class Main extends PApplet {
    float x = 0;
    float y = 0;
    float dx = 10;
    float dy = 10;


    public void settings() {
        size(600 ,600);
    }

    public void draw() {
        background(0, 0, 0);
        fill(255, 0, 0);
        ellipse(x, height / 2, 70, 70);
        fill(255, 250, 0);
        ellipse(width / 2, y, 70, 70);

        x += dx;

        if (x >= width) {
            x = width - 1;
            dx = -dx;
            x += dx;}


        else if(x<0) {
            dx = -dx;
        }

        y += dy;

        if (y >= height) {
            y = height - 1;
            dy = -dy;
            y += dy;}


        else if(y<0) {
            dy = -dy;
        }


    }


    public static void main(String... args) {
        PApplet.main("Main");
    }
}