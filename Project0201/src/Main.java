import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    static int num;

    final float minR = 5;
    final float maxR = 15;
    float[] x;
    float[] y;
    float[] dx;
    float[] dy;
    float[] r;
    int[] c;
    float[] a;
    float[] da;
    final double PI = 3.14159;
    float z = 3.14f / 5;


    public void settings() {
        fullScreen();

    }

    public void setup() {
        frameRate(100);
        noStroke();
        x = new float[num];
        dx = new float[num];
        y = new float[num];
        dy = new float[num];
        r = new float[num];
        c = new int[num];
        da = new float[num];
        a = new float[num];


        for (int i = 0; i < num; ++i) {
            x[i] = random(width);
            y[i] = random(height);
            dx[i] = random(-5, 5);
            dy[i] = random(-5, 5);
            r[i] = random(2 * minR, 2 * maxR);
            da[i] = (float) 0.1f;
            c[i] = 0xff000000 + (int) random(0x00ffffff);
            a[i] = 0.1f;
            da[i] = 0.1f;
        }
    }

    public void draw() {
        background(0);
        for (int i = 0; i < num; i++) {
            stroke(c[i]);
            a[i] += da[i];
            drawStar(x[i], y[i], r[i], a[i]);

            x[i] += dx[i];
            y[i] += dy[i];


            if (x[i] > width - r[i]) {
                x[i] = width - dx[i] - r[i];
                dx[i] = -dx[i];
                da[i] = -da[i];
            }
            if (x[i] - r[i] < 0) {
                x[i] = -dx[i] / 2 + r[i];
                dx[i] = -dx[i];
                da[i] = -da[i];
            }
            if (y[i] - r[i] < 0) {
                y[i] = -dy[i] / 2 + r[i];
                dy[i] = -dy[i];
                da[i] = -da[i];
            }
            if (y[i] > height - r[i]) {
                y[i] = height - dy[i] - r[i];
                dy[i] = -dy[i];
                da[i] = -da[i];
            }

        }
    }

    private void drawStar(float x, float y, float r, float a) {
        pushMatrix();
        translate(x, y);
        rotate(a);
        for (int i = 0; i < 10; i++) {
            line(0, 0, 0, r);
            rotate(z);
        }
        popMatrix();
    }

    public static void main(String... args) {
        num = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PApplet.main("Main");

    }
}

