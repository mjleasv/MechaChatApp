/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import mechachatapp.be.User;
import mechachatapp.bll.exceptions.BllException;
import mechachatapp.bll.validation.AbstractValidation;
import mechachatapp.bll.validation.IValidation;
import mechachatapp.bll.validation.ValidationFactory;
import mechachatapp.gui.model.UserModel;

/**
 * FXML Controller class
 *
 * @author pgn
 */
public class CreateUserViewController extends CommandableController implements Initializable
{

    @FXML
    private TextField txtEmail;
    @FXML
    private Label txtEmailError;
    @FXML
    private TextField txtPassword;
    @FXML
    private TextField txtPasswordAgain;
    @FXML
    private Label txtPasswordAgainError;
    @FXML
    private Label txtPasswordError;
    @FXML
    private TextField txtUserName;
    @FXML
    private Label txtUserNameError;

    private UserModel userModel;

    private IValidation userNameValidation;
    private IValidation emailValidation;
    private IValidation passwordValidation;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        try
        {
            userModel = new UserModel();
            userNameValidation = ValidationFactory.CreateInputValidation(ValidationFactory.ValidationTypes.USER_NAME);
            bindValidation(txtUserName, txtUserNameError, userNameValidation);
            emailValidation = ValidationFactory.CreateInputValidation(ValidationFactory.ValidationTypes.EMAIL);
            bindValidation(txtEmail, txtEmailError, emailValidation);
            passwordValidation = ValidationFactory.CreateInputValidation(ValidationFactory.ValidationTypes.PASSWORD);
            bindValidation(txtPassword, txtPasswordError, passwordValidation);
            IValidation passwordAgainValidation = new AbstractValidation()
            {
                @Override
                public boolean validateInput(String input)
                {
                    String passwrd = txtPassword.getText().trim();
                    String passwrd2 = txtPasswordAgain.getText().trim();
                    if (passwrd.equalsIgnoreCase(passwrd2))
                    {
                        validationMessage = "Passwords are identical";
                        return true;
                    } else
                    {
                        validationMessage = "The passwords are not identical";
                        return false;
                    }
                }

            };
            bindValidation(txtPasswordAgain, txtPasswordAgainError, passwordAgainValidation);
            bindValidation(txtPassword, txtPasswordAgainError, passwordAgainValidation);
        } catch (BllException ex)
        {
            displayException(ex);
        }
    }

    private void bindValidation(TextField txtField, Label errorMsg, IValidation validation)
    {
        txtField.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue)
                -> 
                {
                    if (!validation.validateInput(newValue))
                    {
                        errorMsg.textProperty().setValue(validation.getValidationMessage());
                    } else
                    {
                        errorMsg.textProperty().setValue("");
                    }
        });
    }

    @FXML
    private void handleCreateUser(ActionEvent event) throws BllException
    {
        String userName = txtUserName.getText().trim();
        String email = txtEmail.getText().trim();
        String password = txtPassword.getText().trim();
        User user = userModel.createNewUser(userName, email, password);
        //Switch to login or "InGame" view...
    }

    void setUserModel(UserModel userModel)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
