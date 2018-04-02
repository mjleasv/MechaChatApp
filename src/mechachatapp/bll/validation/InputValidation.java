/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll.validation;

import java.util.List;
import javax.xml.bind.ValidationException;


/**
 *
 * @author mjl
 */
public interface InputValidation {
    boolean validateInput(String input) throws ValidationException;
}

//public class OrInputValidator implements InputValidation
//{
//    private final List<InputValidation> validators;
//    
//    public OrInputValidator(List<InputValidation> validators) {
//        this.validators = validators;
//    }
//
//    @Override
//    public boolean validateInput(String input) throws ValidationException {
//        
//        for (int i = 0; i < validators.size(); i++) {
//            try{
//                return validators.get(i).validateInput(input);
//            }
//            catch(Exception e){ 
//                //... 
//            }
//            
//        }
//        
//        throw new ValidationException("Non of the validations succeeded! :(");
//    }
//}
//
//public class AndInputValidator implements InputValidation
//{
//    private final List<InputValidation> validators;
//    
//    public AndInputValidator(List<InputValidation> validators) {
//        this.validators = validators;
//    }
//
//    @Override
//    public boolean validateInput(String input) throws ValidationException {
//        
//        for (int i = 0; i < validators.size(); i++) {
//            validators.get(i).validateInput(input);
//        }
//        
//        return true;
//    }
//    
//}
