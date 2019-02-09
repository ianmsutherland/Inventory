



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ian
 */
public class MainController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    //@FXML
    //private Label addPartsLabel;
    
    @FXML
    private void showPartScreen(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        Parent root = FXMLLoader.load(getClass().getResource("AddModifyPart.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    
    }
    @FXML
    private void showProductScreen(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        Parent root = FXMLLoader.load(getClass().getResource("AddModifyProduct.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
