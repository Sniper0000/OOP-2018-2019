package ie.dit;

import ddf.minim.AudioInput;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Audio2 extends PApplet
{
    public static int SAMPLE_RATE = 44100;
    public static int RESOLUTION = 16;
    public static int FRAME_SIZE = 1024;
    
    Minim minim;
    AudioInput ai;
    

    public void settings()
    {
        size(FRAME_SIZE, 800);
        minim = new Minim(this);
        ai = minim.getLineIn(Minim.MONO, FRAME_SIZE, SAMPLE_RATE, RESOLUTION);


    }

    float lerpedAverage = 0;

    public void draw() 
    {
        colorMode(HSB);
        background(0);
        float halfH = height / 2;
        float total = 0;
        for (int i = 0; i < ai.bufferSize(); i++) 
        {
            stroke(map(i, 0, FRAME_SIZE, 0,255),255,255);
            line(i, halfH, i, halfH + ai.left.get(i) * halfH);
            total += (float) Math.abs(ai.left.get(i));
        }
        float average = total / (float) FRAME_SIZE;
        noStroke();
        fill(map(average, 0 ,1, 0, 255), 255, 255);
        ellipse(width / 2, 100, average * 400, average * 400);  
    }
}