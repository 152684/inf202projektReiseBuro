/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package userInterface;

import com.mycompany.inf202.*;
import databaseFunctions.SelectRecords;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mbirc
 */
public class LoginMitarbeiterController implements Initializable {

    Mitarbeiter currentUser;
    
    @FXML
    private TextArea sceneText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void fromLogin(long id) throws UngueltigeIDException{
        System.out.println("from login");
        currentUser = SelectRecords.findMitarbeiter(id);
        sceneText.setText("Willkommen Herr/Frau Mitarbeiter" );
    }

    
    @FXML
    private void loginDatenAendern(ActionEvent event) {
        System.out.println("Login daten andern");
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("UserLoginAendern.fxml"));
            Parent root = loader.load();
            //The following both lines are the only addition we need to pass the arguments
            UserLoginAendernController controller2 = loader.getController();
            controller2.LoginCurrentMit(currentUser);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Layout2 + Controller2");
            stage.show();
                
        }catch(IOException e){
            e.printStackTrace();
        }
 
    }

    @FXML
    private void kundeHinzu(ActionEvent event) {
    }

    @FXML
    private void kundeLoeschen(ActionEvent event) {
    }
    
}
