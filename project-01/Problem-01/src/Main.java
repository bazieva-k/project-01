import processing.core.*;

public class Main extends PApplet {
    float x;
    float dx;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2f;
        dx = 10;
    }

    public void draw() {
        background(0, 0, 0);
        ellipse(x, height / 2f, 50, 50);
        x += dx;
        if ( x >= width){
            dx = -dx;
            x = width - 1;
        }
        if(x < 0){
            dx = -dx;
            x = 0;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}
