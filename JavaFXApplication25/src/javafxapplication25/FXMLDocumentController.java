/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication25;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author nando
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("You clicked me if you not i send you an hot image!");
        System.out.println("ME CLICCAT STRUNZ");
        label.setText("Hello World! gruppo twelve");
        label.setText("Ciao da Cami");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
