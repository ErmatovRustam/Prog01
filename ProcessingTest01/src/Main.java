import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        size(600, 600);
    }

    public void draw() {
        background(0);
        fill(254, 100, 100);
        float x = width / 2;
        float y = height / 2;
        float r = 150;

        stroke(255, 0, 0);
        strokeWeight(5);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        line(x - r / 4, y - r / 4, x + r / 4, y + r / 4);
        line(x + r / 4, y - r / 4, x - r / 4, y + r / 4);
        line(x - r / 4, y - r / 4, x - r, y);
        line(x - r / 4, y - r / 4, x, y - r);
        line(x + r / 4, y + r / 4, x, y + r);
        line(x + r / 4, y + r / 4, x + r, y);
        line(x - r / 4, y + r/4,x - r, y);
        line ( x- r /4, y + r /4, x, y +r);
        line(x+r/4, y-r/4, x , y -r);
        line(x+r/4, y-r/4,x +r, y);





        x = width / 4;
        y = height / 4;
        r = 50;
        stroke(255, 100, 90);
        strokeWeight(5);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        line(x - r / 4, y - r / 4, x + r / 4, y + r / 4);
        line(x + r / 4, y - r / 4, x - r / 4, y + r / 4);
        line(x - r / 4, y - r / 4, x - r, y);
        line(x - r / 4, y - r / 4, x, y - r);
        line(x + r / 4, y + r / 4, x, y + r);
        line(x + r / 4, y + r / 4, x + r, y);
        line(x - r / 4, y + r/4,x - r, y);
        line ( x- r /4, y + r /4, x, y +r);
        line(x+r/4, y-r/4, x , y -r);
        line(x+r/4, y-r/4,x +r, y);


        x = width / 4 * 3;
        y = height / 4 ;
        r = 50;
        stroke(50, 255, 90);
        strokeWeight(5);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        line(x - r / 4, y - r / 4, x + r / 4, y + r / 4);
        line(x + r / 4, y - r / 4, x - r / 4, y + r / 4);
        line(x - r / 4, y - r / 4, x - r, y);
        line(x - r / 4, y - r / 4, x, y - r);
        line(x + r / 4, y + r / 4, x, y + r);
        line(x + r / 4, y + r / 4, x + r, y);
        line(x - r / 4, y + r/4,x - r, y);
        line ( x- r /4, y + r /4, x, y +r);
        line(x+r/4, y-r/4, x , y -r);
        line(x+r/4, y-r/4,x +r, y);

        x = width / 4 * 3;
        y = height / 4 *3;
        r = 50;
        stroke(0, 0, 90);
        strokeWeight(5);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        line(x - r / 4, y - r / 4, x + r / 4, y + r / 4);
        line(x + r / 4, y - r / 4, x - r / 4, y + r / 4);
        line(x - r / 4, y - r / 4, x - r, y);
        line(x - r / 4, y - r / 4, x, y - r);
        line(x + r / 4, y + r / 4, x, y + r);
        line(x + r / 4, y + r / 4, x + r, y);
        line(x - r / 4, y + r/4,x - r, y);
        line ( x- r /4, y + r /4, x, y +r);
        line(x+r/4, y-r/4, x , y -r);
        line(x+r/4, y-r/4,x +r, y);


        x = width / 4;
        y = height / 4 * 3 ;
        r = 50;
        stroke(200, 100, 255);
        strokeWeight(5);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        line(x - r / 4, y - r / 4, x + r / 4, y + r / 4);
        line(x + r / 4, y - r / 4, x - r / 4, y + r / 4);
        line(x - r / 4, y - r / 4, x - r, y);
        line(x - r / 4, y - r / 4, x, y - r);
        line(x + r / 4, y + r / 4, x, y + r);
        line(x + r / 4, y + r / 4, x + r, y);
        line(x - r / 4, y + r/4,x - r, y);
        line ( x- r /4, y + r /4, x, y +r);
        line(x+r/4, y-r/4, x , y -r);
        line(x+r/4, y-r/4,x +r, y);







    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}