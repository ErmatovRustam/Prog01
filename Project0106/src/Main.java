import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    static int num;


    float a1 = 0;
    final float PI = 3.14f;
    float z = PI / num;
    int i = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {

       // frameRate(100);
        noStroke();
    }


    public void draw() {
        background(0);
        translate(width / 2, height / 2);
        rotate(a1);
        fill(255, 1, 1, 100);
        for(i=1; i<=num; i++) {
            ellipse(0, 0, 100, 600);

            rotate(z);
        }
        a1 +=0.05;

    }

    public static void main(String... args) {
        num = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PApplet.main("Main");
    }
}