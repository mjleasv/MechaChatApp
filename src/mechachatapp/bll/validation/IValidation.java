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
public interface IValidation
{

    public boolean validateInput(String input);

    public String getValidationMessage();

}
