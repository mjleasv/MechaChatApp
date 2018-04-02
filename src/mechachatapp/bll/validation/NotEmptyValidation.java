/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll.validation;

import javax.xml.bind.ValidationException;

/**
 *
 * @author mjl
 */
public class NotEmptyValidation implements InputValidation {

    @Override
    public boolean validateInput(String input) throws ValidationException {
        if(input.isEmpty()) throw new ValidationException("input cannot be empty");
        
        return true;
    }
    
}
