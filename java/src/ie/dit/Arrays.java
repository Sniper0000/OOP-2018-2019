package ie.dit;

import processing.core.PApplet;

public class Arrays extends PApplet
{
    float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                        "Aug", "Sep", "Oct", "Nov", "Dec"};

    //float[] fa = {10, 9}; //example of sign the value of array
    float[] fa = new float[2];//sign the array and sign the value later


    public void settings()
    {
        size(500,500);
    }

    public void setup()
    {
        fa[0] = 10;
        fa[1] = 4;

        System.out.println(fa[0]);
        System.out.println(fa[1]);

        for(int i = 0; i < rainFall.length; i ++)
        {
            System.out.println(months[i] + "\t" + rainFall[i]);
        }

        for(float f:rainFall)//for each loop
        {
            System.out.println(f);
        }

        float total = 0;
        for(float f:rainFall)
        {
            total += f;
        }
        System.out.println("Total: " + total);

        total = 0;
        
        for(int i = 0; i < rainFall.length; i ++)
        {
            total += rainFall[i];
        }

        float average = total / (float) rainFall.length;
        System.out.println(average);

        float max = rainFall[0];
        int maxIndex = -1;
        for(int i = 0; i < rainFall.length; i ++)
        {
            if(rainFall[i] > max)
            {
                max = rainFall[i];
                maxIndex = i;
            }
        }

        max = Float.MIN_VALUE;
        for(int i = 0; i < rainFall.length; i ++)
        {
            if(rainFall[i] > max)
            {
                max = rainFall[i];
                maxIndex = i;
            }
        }
        
        System.out.println(months[maxIndex]
                + " had the highest rainfall of "
                + rainFall[maxIndex]);

        float min = Float.MAX_VALUE;
        int minIndex = -1;
        for(int i = 0; i < rainFall.length; i ++)
        {
            if(rainFall[i] < min)
            {
                min = rainFall[i];
                minIndex = i;
            }
        }
        System.out.println(months[minIndex]
                + " had the lowest rainfall of "
                + rainFall[minIndex]);

        

        colorMode(HSB);
        textAlign(LEFT, CENTER);

        float h = height / (float) rainFall.length;
        for(int i = 0; i < rainFall.length; i ++)
        {
            noStroke();
            fill(random(0,255),255,255);
            rect(0,i * h, rainFall[i] * 2, h);
            fill(0);
            Float textY = i * h + (h * 0.5f);
            text(months[i], 50, textY);
        }
    }

    /*
    public void draw()
    {
        background(0,100,0);
        int h = height / rainFall.length;
        int w = width / rainFall.length;
        for(int i = 0; i < rainFall.length; i ++)
        {
            rect()
        }
    }*/
    public void draw()
    {
        int m = mouseY /rainFall.length;

        fill(0);
        text(rainFall[m],400,300);
    }

}