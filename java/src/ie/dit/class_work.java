package ie.dit;

import processing.core.PApplet;

public class class_work extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

	public void draw() {
        background(255,0,0);
        noStroke();

        fill(255,255,51);
        ellipse(250,290,400,400);
        
        fill(0,255,255);
        triangle(250,50,50,450,450,450);

        fill(128,128,128);
        ellipse(250,250,195,100);

        fill(0,0,0);
        ellipse(250,250,80,80);
        
	}	
}