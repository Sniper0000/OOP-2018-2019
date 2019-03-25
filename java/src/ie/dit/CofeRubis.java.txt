package ie.dit;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class CafeRubis extends PApplet
{
    ArrayList<Product> products = new ArrayList<Product>();

    public void settings()
    {
        size(800,800);
        loadProducts();
    }

    void loadProducts()
    {
        Table table = loadTable("cafe.csv", "header");
        for(TableRow tr:table.rows())
        {
            Product p = new Product(tr);
            products.add(p);
        }
    }

    public void mouseClicked()
    {
        
    }

    void drawProductButton()
    {
        
        /*
        float border = 20;
        float buttonWidth = 100;
        float buttonHeight = 50;
        float gap = 10;
         */
        for(int i = 0; i < products.size(); i ++)
        {
            float y = border + (i * buttonHeight + gap);
            float x = border;
            noFill();
            stroke(0);
            rect(x, y, buttonWidth, buttonHeight);
            textAlign(CENTER, CENTER);
            fill(0);
            text(p.getName(), x + buttonWidth * 0.5f, y + buttonHeight * 0.5f)

        }
    }

    public void draw()
    {

    }
}