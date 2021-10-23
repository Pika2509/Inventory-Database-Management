/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gopik
 */
public class Prods {
    
    private int id;
    private String name;
    private int quantity;
    private int price;
    private String desc;
    private String category;
    
    
    public  Prods(int Id, String name, int quantity, int price, String desc, String category)
    {
        this.id = Id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.desc = desc;
        this.category = category;
    }

    Prods(int aInt, String string, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public String getCategory()
    {
        return category;
    }
}
