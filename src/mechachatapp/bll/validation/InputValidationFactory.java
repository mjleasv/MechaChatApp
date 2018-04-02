/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll.validation;

/**
 *
 * @author mjl
 */
public class InputValidationFactory
{
    private static final InputValidation emailValidator = new EmailValidation();
    
    //Make sure no one can contruct us.
    private InputValidationFactory() {
    }
    
    
     public static InputValidation CreateInputValidation(InputValidationType type) {
        switch(type)
        {
            case VALIDATE_EMAIL:
                return emailValidator;
            case VALIDATE_NOT_EMPTY:
                return new NotEmptyValidation();
                    
            default:
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public static InputValidation CreateAndInputValidation(InputValidationType[] validations) {
        InputValidation[] validators = new InputValidation[validations.length];
        
        for (int i = 0; i < validations.length; i++) {
            validators[i] = CreateInputValidation(validations[i]);
        }
        
        return new AndInputValidation(validators);
    }
}
