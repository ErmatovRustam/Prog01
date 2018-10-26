import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static String name;

    float x;
    float dx = 10;

    public void settings() {
        size(600, 600);
        x = width / 2;
    }

    public void draw() {
        background(0);
        textAlign(CENTER, CENTER);
        textSize(72);
        text(name, x, height/2);
        x+=dx;

        float w = textWidth(name) / 2;


        if (x > width -w){
            x = width - w -1;
            dx = -dx;
        }
        else if (x < w) {
            x =w;
            dx = -dx;
        }



    }

    public static void main(String... args) {
        name = JOptionPane.showInputDialog("Name: ");
        PApplet.main("Main");


    }
}