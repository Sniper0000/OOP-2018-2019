package ie.dit;

import processing.data.*;

public class Product
{
    private String name;
    private float price;

    public Product(String name, float price)
    {
        this.name = name;
        this.price = price;
    }

    public Product(TableRow tr)
    {
        // Constructor chaining
        this(tr.getString("Name"), tr.getString("Price"));
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    

}