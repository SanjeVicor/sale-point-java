/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0d3br34k3r
 */
public class Product {
    String name;
    float price;
    int id;
    
    public Product(int id,String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public float getPrice(){
        return this.price;
    }
}
