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
public class EmailValidation implements InputValidation {

    @Override
    public boolean validateInput(String input) throws ValidationException {
        String[] parts = input.split("@");
        //an email is split by an "@" sign, but only 1
        if(parts.length != 2) throw new ValidationException("Email must contain an @");
        
        String[] domainParts = parts[1].split(".");
        
        //the domain has to have a "." and at least 2 parts, eg. "mail.co.uk" is okay
        if(domainParts.length < 2) throw new ValidationException("Email demain must contain a .");
        
        //This is probably a very loose intepretation of the email validation.
        return true;
    }
    
}
