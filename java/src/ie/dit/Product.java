<<<<<<< HEAD
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

    

=======
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

    public String toString()
    {
        return name + "\t" + price;
    }

    public Product(TableRow tr)
    {
        // Constructor chaining
        this(tr.getString("Name"), tr.getFloat("Price"));
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
>>>>>>> 76af277bf529f17c2d5302b15ecfee421804c177
}