import processing.core.PApplet;

import java.util.Scanner;

public class BallChallenge  extends PApplet {


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int x=4;


    public static void main(String[] args) {PApplet.main("BallChallenge", args);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);


    }


    @Override
    public void draw() {
            drawCircle();
    }

    public void drawCircle() {
        //int i=2;
       // for (int i = 1; i <6; i++) {
        ellipse(x+10,50,10, 10);
        ellipse(x+20,100,10, 10);
        ellipse(x+30,150,10, 10);
        ellipse(x+50,200,10, 10);
            x++;
      // }
    }
    private void paintwhite() {
        background(255);
    }
}