/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll.validation;

/**
 *
 * @author pgn
 */
public class PasswordLengthValidation extends AbstractValidation
{

    public static final int MINIMUM_PASSWORD_LENGTH = 8;

    @Override
    public boolean validateInput(String input)
    {
        if (input.length() < MINIMUM_PASSWORD_LENGTH)
        {
            validationMessage = "Password must be minimum " + MINIMUM_PASSWORD_LENGTH + " chars long.";
            return false;
        } else
        {
            validationMessage = "";
            return true;
        }
    }

}
