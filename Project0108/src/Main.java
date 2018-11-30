import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    float alphaE = 0;
    float alphaM = 0;
    float alphaV = 0;


    public void settings() {

        fullScreen();
    }

    public void setup() {
        frameRate(100);
    }


    public void draw() {
        background(0);

        translate(width / 2, height / 2);

        fill(255, 255, 0);
        ellipse(0, 0, 150,150);



        rotate(alphaE);
        translate(135,0);
        fill(0,0,100);
        ellipse(0, 0, 50,50 );

        rotate(alphaV);
        translate(140,0);
        fill(0,100,100);
        ellipse(0, 0, 50,50 );

        rotate(alphaM);
        translate(70,0);
        fill(255);
        ellipse(0,0,40,40);

        alphaE += 0.01;
        alphaM+=0.3;


    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}