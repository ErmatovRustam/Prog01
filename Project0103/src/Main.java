import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    float x, y, w, h, dh, v;
    int x1, x2, x3, x4, x5, x6, x7, x8;

    int r, g, b, dr, N;



    public void settings() {
        fullScreen();
    }

    public void setup() {

        x = 683;
        x1 = 793;
        x2 = 903;
        x3 = 1013;
        x4 = 1123;
        x5 = 573;
        x6 = 463;
        x7 = 353;
        x8 = 243;

        y = height / 2;


        w = 110;
        h = 250;
        r = 255;
        dr = 50;
        g = 0;
        b = 0;
        dh = 50;
        N = 9;
        frameRate(10);
    }

    public void draw() {
        background(0);


        fill(r, g, b);
        if (x < 1123) {
            x += w;
            ellipse(x, y, w, h);

        } else {
            x = 243;
            //   x += w;
            ellipse(x, y, w, h);
        }


        fill(r - 50, g, b);
        if (x1 < 1123) {
            x1 += w;
            ellipse(x1, y, w, h - dh);
        } else {
            x1 = 243;
            //  x1 += w;
            ellipse(x1, y, w, h - dh);


        }

              fill(r - 50, g, b);
              if (x5 < 1123) {
                  x5 += w;
                  ellipse(x5, y, w, h - dh);
              }
              else {
                  x5 = 243;
                //  x5 += w;
                  ellipse(x5, y, w, h - dh);
              }

              fill(r - 100, g, b);
              if (x2 < 1123) {
                  x2 += w;
                  ellipse(x2, y, w, h - 2 * dh);
              }
              else {
                  x2 = 243;
                //  x2 += w;
                  ellipse(x2, y, w, h - 2 * dh);
              }

              fill(r - 100, g, b);
              if (x6 < 1123) {
                  x6 += w;
                  ellipse(x6, y, w, h - 2 * dh);
              }
              else {
                  x6 = 243;
               //   x6 += w;
                  ellipse(x6, y, w, h - 2 * dh);
              }


              fill(r - 150, g, b);
              if (x3 < 1123) {
                  x3 += w;
                  ellipse(x3, y, w, h - 3 * dh);
              }
             else {
                  x3 = 243;
                //  x3 += w;
                  ellipse(x3, y, w, h - 3 * dh);
              }


              fill(r - 150, g, b);
              if (x7 < 1123) {
                  x7 += w;
                  ellipse(x7, y, w, h - 3 * dh);
              } else {
                  x7 = 243;
                //  x7 += w;
                  ellipse(x7, y, w, h - 3 * dh);
              }


              fill(r - 200, g, b);
              if (x4 < 1123) {
                  x4 += w;
                  ellipse(x4, y, w, h - 4 * dh);
              } else {
                  x4 = 243;
                 //  x4 += w;
                  ellipse(x4, y, w, h - 4 * dh);
              }

              fill(r - 200, g, b);
              if (x8 < 1123) {
                  x8 += w;
                  ellipse(x8, y, w, h - 4 * dh);
              } else {

                  x8 = 243;
                  ellipse(x8, y, w, h - 4 * dh);
              //    x8 +=w;


              }
              System.out.println(width);


//      fill(r - 200, g, b);
//      if (x8 < 1123) {
//          x8 += w;
//          ellipse(x8 - 4 * w, y, w, h - 4 * dh);
//      } else {
//          x8 = 243;
//          x8 += w;
//      }


    }

    public static void main(String... args) {

        PApplet.main("Main");
    }
}