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
}