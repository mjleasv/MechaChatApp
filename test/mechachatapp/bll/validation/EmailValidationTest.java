/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll.validation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pgn
 */
public class EmailValidationTest
{

    public EmailValidationTest()
    {
    }

    /**
     * Test of getValidationMessage method, of class EmailValidation.
     */
    @Test
    public void testGetValidationMessageGoodEmail()
    {
        EmailValidation instance = new EmailValidation();
        instance.validateInput("agood@email.com");
        String expResult = "Email is valid";
        String result = instance.getValidationMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValidationMessage method, of class EmailValidation.
     */
    @Test
    public void testGetValidationMessageBadEmail()
    {
        EmailValidation instance = new EmailValidation();
        instance.validateInput("abademailcom");
        String expResult = "Email is invalid";
        String result = instance.getValidationMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class EmailValidation.
     */
    @Test
    public void testValidateInputGoodEmail()
    {
        String input = "good@email.com";
        EmailValidation instance = new EmailValidation();
        boolean expResult = true;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class EmailValidation.
     */
    @Test
    public void testValidateInputBadEmail()
    {
        String input = "imnov@lid";
        EmailValidation instance = new EmailValidation();
        boolean expResult = false;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }

}
