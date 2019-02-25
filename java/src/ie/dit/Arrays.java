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
/*
package ie.dit;

import processing.core.PApplet;

public class Arrays extends PApplet
{
    float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"
            , "Aug", "Sep", "Oct", "Nov", "Dec"};

    float[] fa = new float[2];        
    int[] colors = new int[rainFall.length];

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        // Putting values into array elements
        fa[0] = 10;
        fa[1] = 4;

        // Getting a value from an array element
        System.out.println(fa[0]);
        

        // Iterating over an array
        for(int i = 0 ; i < rainFall.length; i ++)
        {
            System.out.println(months[i] + "\t" + rainFall[i]);
        }

        // Using the for each loop
        for(float f:rainFall)
        {
            System.out.println(f);
        }

        // Calculate the total
        float total = 0;
        for(float f:rainFall)
        {
            total += f;
        }
        System.out.println("Total: " + total);

        // The same, but with a for loop
        total = 0;
        for(int i = 0 ; i < rainFall.length ; i ++)
        {
            total += rainFall[i];
        }


        float average = total / (float) rainFall.length;
        System.out.println(average);

        // Find the max element
        float max = Float.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0 ; i < rainFall.length ; i ++)
        {
            if (rainFall[i] > max)
            {
                max = rainFall[i];
                maxIndex = i;
            }
        }

        System.out.println(months[maxIndex] 
                + " had the highest rainfall of " 
                + rainFall[maxIndex]);

        // Find the min element                
        float min = Float.MAX_VALUE; // The biggest value a float can be
        int minIndex = -1;
        for(int i = 0 ; i < rainFall.length ; i ++)
        {
            if (rainFall[i] < min)
            {
                min = rainFall[i];
                minIndex = i;
            }
        }
        System.out.println(months[minIndex] 
                + " had the lowest rainfall of " 
                + rainFall[minIndex]);

        // Assign the color array
        for(int i = 0 ; i < rainFall.length ; i ++)        
        {
            colors[i] =(int) random(0, 255);
        }
    } 

    void drawBarChart()
    {
        colorMode(HSB);
        textAlign(LEFT, CENTER);
        
        float h = height / (float) rainFall.length;        
        for(int i = 0 ; i < rainFall.length ; i ++) 
        {
            noStroke();
            fill(colors[i], 255, 255);
            rect(0, map(i, 0, rainFall.length, 0, height), rainFall[i] * 2, h);
            fill(255);
            float textY = map(i, 0, rainFall.length, h * 0.5f, height + (h * 0.5f));//i * h + (h * 0.5f);
            text(months[i], 5, textY);
        }       
    }

    public void draw()
    {
        background(0);

        drawBarChart();

        float gap = height / (float) rainFall.length;
        int m = (int) Math.floor(mouseY / gap);
        fill(255);
        text(rainFall[m], 300, height / 2);
    }
}
*/