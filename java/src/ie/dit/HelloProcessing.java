package ie.dit;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

	/*public void draw() {
		background(0,0,255);//RGB value
		stroke(255,0,0);
		fill(255,255,0);
		line(10, 10, 100, 100);	//x1, y1, x2, y2
		point(50,50);//x, y
		ellipse(100,200,500,150);//cx, cy, w, h
		fill(0,255,0);
		rect(50,10,100,200);//tlx, tly, w, h
		triangle(10,10,100,90,200,200);//vertices,x1,y1,x2,y2,x3,y3
	}*/

	// outside two of the method those variables becomes field of this class
	int x = 0; // 4 bytes
	float f = 0.0f; // 4 bytes
	char c = 'h'; // Unicode
	String s = "Hello";
	boolean b = (1 == 0);// 1 >= 0 , 1 <= 0
	double d = 0; // 8 bytes

	public void draw() {
		/*
		x = 0;
		x = x + 10;
		x += 10;//same as x = x + 10
		x = x / xx;
		x /= xx;
		x *= 10;//x = x * 10

		s += "World";
		*/

		background(0);
		noStroke();
		fill(255);
		ellipse(x,mouseY,50,50);
		x ++;
	}	
}
