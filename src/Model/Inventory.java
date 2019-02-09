/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;

/**
 *
 * @author ian
 */
public class Inventory {

    ArrayList products = new ArrayList<Product>();
    ArrayList allParts = new ArrayList<Part>();
    
    public void addProduct(Product product) {
        
    }
    public boolean removeProduct(int id) {
        return true;
    }
    /*public Product lookupProduct(int id) {
        return product.getProductId(id);
    }*/
    public void updateProduct(int id) {
        
    }
    public void addPart(Part pt) {
    }
    public boolean deletePart(Part pt) {
        return true;
    }
    /*public Part lookupPart(int id) {
    }*/
    public void updatePart(int id) {
        
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    

