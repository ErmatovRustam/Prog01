import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static String name, sname;

    float x1;
    float y1;
    float x2;
    float y2;

    double t = 50;
    double dx1;
    double dx2;
    double dis1;
    double dis2;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        x1 = width / 2 ;
        y1 = height / 2;

        x2 = width / 2 ;
        y2 = height / 2;


        dis1 = (width / 2) - (textWidth(name) / 2);
        dis2 = (width / 2) - (textWidth(sname) / 2);
        dx1 =  dis1 / t;
        dx2 = dis2 / t;


        frameRate(100);
    }


    public void draw() {

        background(30);
        textSize(72);
        textAlign(CENTER, CENTER);
        fill(0, 100, 100);
        text(name, x1, y1);
        fill(200, 100, 0);
        text(sname, x2, y2 / 3 * 4);



        float w1 = textWidth(name) / 2;


        if (x1 > width - w1) {
            x1 = width - w1;
            dx1 = -dx1;
        } else if (0 + w1 > x1) {
            x1 = w1;
            dx1 = -dx1;
        }

        float w2 = textWidth(sname) / 2;

        if (x2 > width - w2) {
            x2 = width - w2 - 1;
            dx2 = -dx2;
        } else if (x2 < 0 + w2) {
            x2 = w2;
            dx2 = -dx2;

        }
        x1 += dx1;
        x2 -= dx2;


    }

    public static void main(String... args) {
        name = JOptionPane.showInputDialog("Name: ");
        sname = JOptionPane.showInputDialog("Surname: ");
        PApplet.main("Main");
    }
}