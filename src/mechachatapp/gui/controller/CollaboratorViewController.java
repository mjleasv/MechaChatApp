/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import mechachatapp.gui.model.UserModel;

/**
 * FXML Controller class
 *
 * @author pgn
 */
public class CollaboratorViewController extends CommandableController implements Initializable
{

    @FXML
    private Button btnAllCollabsLeft;
    @FXML
    private Button btnAllCollabsRight;
    @FXML
    private Button btnMyCollabsLeft;
    @FXML
    private Button btnMyCollabsRight;
    @FXML
    private FlowPane paneAllCollaborators;
    @FXML
    private FlowPane paneMyCollaborators;
    @FXML
    private TextField txtSearchAllCollabs;
    @FXML
    private TextField txtSearchYourCollabs;

    private UserModel userModel;

    public void setUserModel(UserModel userModel)
    {
        this.userModel = userModel;
        
        
        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
    }

    @FXML
    private void handleAddCollaborator(ActionEvent event)
    {
        
    }

    @FXML
    private void handleRemoveCollaborator(ActionEvent event)
    {
    }

}
