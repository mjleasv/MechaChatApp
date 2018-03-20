/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mechachatapp.bll.exceptions.BllException;
import mechachatapp.gui.model.UserModel;

/**
 * FXML Controller class
 *
 * @author pgn
 */
public class LogInViewController extends CommandableController implements Initializable
{
    
    @FXML
    private Label txtEmailError;
    @FXML
    private TextField txtPassword;
    @FXML
    private TextField txtUserName;
    @FXML
    private Label txtUserNameError;
    
    private UserModel userModel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        try
        {
            userModel = new UserModel();
        } catch (BllException ex)
        {
            displayException(ex);
        }
    }
    
    @FXML
    private void handleCreateUser(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/mechachatapp/gui/view/CreateUserView.fxml"));
            Parent parent = loader.load();
            CreateUserViewController controller = loader.getController();
            controller.setUserModel(userModel);
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.showAndWait();
            switchToGameView();
        } catch (IOException ex)
        {
            displayException(new BllException("Could not load \"Create User\" screen", ex));
        }
    }
    
    @FXML
    private void handleLogIn(ActionEvent event)
    {
        //TODO Get login credentials and login through the user model
        switchToGameView();
    }
    
    @FXML
    private void handleQuit(ActionEvent event)
    {
        Runtime.getRuntime().exit(0);
    }
    
    private void switchToGameView()
    {
        if (userModel.getLoggedInUser() != null)
        {
            //TODO Load "Game" screen
        }
    }
    
}
