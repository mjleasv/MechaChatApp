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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

    @FXML
    private void handleLogIn(ActionEvent event)
    {

    }

    @FXML
    private void handleQuit(ActionEvent event)
    {

    }

}
