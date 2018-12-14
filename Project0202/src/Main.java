import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    static int num;

    final float minR = 3;
    final float maxR = 12;
    float[] x;
    float[] y;
    float[] dx;
    float[] dy;
    float[] r;
    int[] c;
    int[] sw;
    float[] a;
    float[] da;
    final double PI = 3.14159;
    float z = 3.14f / 4;


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
        sw = new int[num];

        for (int i = 0; i < num; ++i) {
            x[i] = random(width);
            y[i] = random(height);
            dx[i] = random(-1.5f, 1.5f);
            r[i] = random(2 * minR, 2 * maxR);
            da[i] = (float) 0.1f;
            a[i] = 0.1f;
            da[i] = random(-0.1f, 0.1f);


            if (r[i] > 20) {
                dy[i] = 9;
                c[i] = 0xffffffff;
                sw[i] = 3;
                strokeWeight(sw[i]);
            } else if ((r[i] < 20) && (r[i] > 15)) {
                dy[i] = 6;
                c[i] = 0x80ffffff;
                sw[i] = 1;
                strokeWeight(sw[i]);
            } else if ((r[i] < 15) && (r[i] > 5)) {
                dy[i] = 3;
                c[i] = 0x40ffffff;
            }
            strokeWeight(3);
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


            if (x[i] > 2) {
                x[i] = x[i];
                dx[i] = -dx[i];
            }
            if (x[i] < -1) {
                x[i] = x[i];
                dx[i] = -dx[i];
            }

            if (y[i] > height + r[i]) {
                y[i] = 0 - dy[i] - r[i];
            }

        }
    }

    private void drawStar(float x, float y, float r, float a) {
        pushMatrix();
        translate(x, y);
        rotate(a);
        for (int i = 0; i < 4; i++) {
            line(0, -r, 0, r);
            rotate(z);
        }
        popMatrix();
    }

    public static void main(String... args) {
        num = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PApplet.main("Main");

    }
}

