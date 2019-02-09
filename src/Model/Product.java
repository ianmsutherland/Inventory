/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
/**
 *
 * @author ian
 */
public class Product {
    private ArrayList associatedParts = new ArrayList<Part>();
    private int productID, inStock, min, max;
    private double price;
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
    public int getInStock() {
        return this.inStock;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMin() {
        return this.min;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getMax() {
        return this.max;
    }
    public void addAssociatedPart(Part part) {
    }
    public boolean removeAssociatedPart(int id) {
        return true;
    }
    /*public Part lookupAssociatedPart(int id) {
    }*/
    public void setProductID(int id) {
        this.productID = id;
    }
    public int getProductID(int id) {
        return this.productID;
    }
    
}
