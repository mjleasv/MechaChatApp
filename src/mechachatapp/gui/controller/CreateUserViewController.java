/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.controller;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import mechachatapp.gui.model.MechaChatLogModel;

/**
 * FXML Controller class
 *
 * @author mjl
 */
public class CreateUserViewController implements Initializable {

    @FXML
    private JFXTextField username;
    @FXML
    private JFXTextField password;
    @FXML
    private Label errorLabel;
    
    private MechaChatLogModel model;
    
    private Stage stage;
    
    private boolean cancelled;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXTextField passwordAgain;

    public boolean isCancelled() {
        return cancelled;
    }

    public void setModel(MechaChatLogModel model) {
        this.model = model;
        cancelled = false;
    }
    
    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void handleCancel(ActionEvent event) {
        cancelled = true;
        stage.close();
    }

    @FXML
    private void handleCreate(ActionEvent event) {
        model.createUser(username.getText(), email.getText(), password.getText());
        stage.close();
    }
    
}
