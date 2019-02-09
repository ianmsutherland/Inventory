/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ian
 */
public class AddModifyProductController implements Initializable {

    @FXML
    private Label IDLabel;
    @FXML
    private TextField IdText;
    @FXML
    private Label NameLabel;
    @FXML
    private TextField NameText;
    @FXML
    private Label InvLabel;
    @FXML
    private TextField InvText;
    @FXML
    private Label PriceLabel;
    @FXML
    private TextField PriceText;
    @FXML
    private Label MaxLabel;
    @FXML
    private TextField MaxText;
    @FXML
    private TextField MinText;
    @FXML
    private Label MinLabel;
    @FXML
    private Label AddModifyTitle;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
