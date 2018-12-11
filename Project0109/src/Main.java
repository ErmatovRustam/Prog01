import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static int num;

    // float x;
// float y;
// int a = 100;
// int n = 0;
    float d = 600 / num;  // diametr of each cube
    float i = 100;
    float j = 100;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        //  x = width / 2;
        //  y = height / 2;
        //  frameRate(1);
        //  rectMode(CENTER);


    }


    public void draw() {
        //   background(0);
        background(30);
        translate(width / 2 - 300, height / 2 - 300);


        for (int i = 0; i < num * d; i += d) {

            for (int j = 0; j < num * d; j += d) {

                if (i % (d * 2) == 0 && (j + d) % (d * 2) == 0 || (i+ d) % (2* d)==0 && j % (2 * d) == 0) {
                    fill(155, 0, 0);
                    rect(i, j, d, d);
                } else {
                    fill(0, 0, 155);
                    rect(i, j, d, d);
                }


//      for (x = 300; x < 300 + num * 50; x += 50) {

//          for (y = 300; y < 300 + num * 50; y += 50) {
//              n++;
//              if (n % 2 == 0 && y % 100 == 0) {
//                  fill(150, 0, 0);
//                  rect(x, y, 50, 50);
//              } else {
//                  fill(0, 150, 0);
//                  rect(x, y, 50, 50);
//              }

//              int pos = 0;

            }
        }


    }


    public static void main(String... args) {
        //name = JOptionPane.showInputDialog("Name: ");
        num = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PApplet.main("Main");
    }
}