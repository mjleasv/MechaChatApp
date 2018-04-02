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
public class AndInputValidation implements InputValidation {

    private final InputValidation[] validations;

    public AndInputValidation(InputValidation[] validations) {
        this.validations = validations;
    }

    
    
    @Override
    public boolean validateInput(String input) throws ValidationException {
        for (InputValidation validation : validations) {
            validation.validateInput(input);
        }
        
        //If we got here, everything worked out.
        return true;
    }
    
}
