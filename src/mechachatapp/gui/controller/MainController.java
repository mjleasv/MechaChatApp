/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import mechachatapp.gui.model.UserModel;

/**
 * FXML Controller class
 *
 * @author pgn
 */
public class MainController implements Initializable
{

    private UserModel userModel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {

    }

    void setUserModel(UserModel userModel)
    {
        this.userModel = userModel;
    }

}
