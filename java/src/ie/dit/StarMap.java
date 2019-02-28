<<<<<<< HEAD
package ie.dit;

import processing.core.*;
import processing.data.*;

public class StarMap extends PApplet
{
    public void settings()
    {
        size(800,800);
    }

    ArrayList<Star> star = new ArrayList<Star>();

    public void setup()
    {
        Table table = loadTable("HabHYG15ly.csv","header");
        for(TableRow row:table.rows())
        {
            //System.out.println(row.getString("Display Name"));
            Star s = new Star(row);
            Stars.add(s);



            s.setDisplayName(row.getString("Display Name"));
            s.setAbsMag(row.getFloat("AbsMag"));
        }

        for(Star s:stars)
        {
            System.out.println(s);
        }
    }

    public void draw()
    {

    }
=======
package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{
    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        loadData();
        printStars();
        border = width * 0.05f;
    }

    public void loadData()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");
        
        /*
        for(int i = 0 ; i < table.getRowCount() ; i ++)
        {
            TableRow row = table.getRow(i);
            System.out.println(row.getString("Display Name"));
            System.out.println(row.getString("Hab?"));            
        }
        */

        for(TableRow row:table.rows())
        {
            Star star = new Star(row);
            stars.add(star);     
        }
    }

    public void printStars()
    {
        for(Star star:stars)
        {
            System.out.println(star);
        }
    }

    float border;

    private void drawGrid()
    {
        textAlign(CENTER, CENTER);
        for(int i = -5 ; i <= 5 ; i ++)
        {
            float x = map(i, -5, 5, border, width - border);
            stroke(0, 0, 255);
            line(x, border, x, height - border);
            fill(255);
            text(i, x, border / 2);
            stroke(0, 0, 255);
            line(border, x, width - border, x);
            fill(255);            
            text(i, border / 2, x);
        }
    }

    public void drawStars()
    {
        textAlign(LEFT, CENTER);
        for(Star s:stars)
        {
            float x = map(s.getxG(), -5, 5, border, width - border);
            float y = map(s.getyG(), -5, 5, border, height - border);

            stroke(255, 255, 0);
            noFill();
            ellipse(x, y, s.getAbsMag(), s.getAbsMag());

            stroke(0, 255, 255);
            line(x, y - 5, x, y + 5);
            line(x - 5, y, x + 5, y);
            fill(255);
            text(s.getDisplayName(), x + 20, y);
            
            

        }
    } 

    public void mousePressed()
    {
        //mouseX, mouseY;    
    }

    public void draw()
    {
        background(0);
        drawGrid();
        drawStars();
    }

    private ArrayList<Star> stars = new ArrayList<Star>();

>>>>>>> 2463b2be8917749d4f351bb20f410a3ba554f29c
}