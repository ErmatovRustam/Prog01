import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        size(600, 600);
    }

    public void draw() {
        background(0);
        textAlign(CENTER, CENTER);
        textSize(72);
        text("Hello World!!!", width / 2, height / 2);
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}