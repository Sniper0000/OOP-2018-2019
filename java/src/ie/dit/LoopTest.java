package ie.dit;

import processing.core.PApplet;

public class LoopTest extends PApplet
{
    public void settings()
    {
        size(500,500);
    }

    public void setup()
    {
        dx = 0;
        dy = 0;
        cx = width / 2;
        cy = height / 2;
        
    }

    public void drawFace(float x, float y, float w) {
        ellipse(x, y, w, w);
        ellipse(x - 10, y - 10, 10, 10);
        ellipse(x + 10, y - 10, 10, 10);
        line(x, y - 5, x, y + 5);
        line(x - 10, y + 20, x + 10, y + 20);
        line(x - 10, y + 20, x - 15, y + 15);
        line(x + 10, y + 20, x + 15, y + 15);
    }

    float dx, dy;
    float cx, cy;

    public void loops()
    {
        float gap = height / 10;
        for(int lines = 0; lines < 10; lines++)
        {
            line(0, lines * gap, width, lines * gap);
        }
    }

    void loops1() {
        int numLines = 20;
        float gap = width / numLines;

        for (int l = 0; l <= numLines; l++) {
            float x = l * gap;
            line(x, 0, width - x, height);
            line(0, x, width, height - x);
        }
    }

    public void draw() 
    {
        background(0);
        stroke(255);
        noFill();
        
        loops1();
    }
}