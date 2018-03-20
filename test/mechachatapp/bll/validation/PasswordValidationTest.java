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
public class PasswordValidationTest
{
    
    public PasswordValidationTest()
    {
    }

    /**
     * Test of validateInput method, of class PasswordLengthValidation.
     */
    @Test
    public void testValidateInputShort()
    {
        String input = "IMSHORT";
        PasswordLengthValidation instance = new PasswordLengthValidation();
        boolean expResult = false;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of validateInput method, of class PasswordLengthValidation.
     */
    @Test
    public void testValidateInputLongEnough()
    {
        String input = "IMLONGER";
        PasswordLengthValidation instance = new PasswordLengthValidation();
        boolean expResult = true;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }
    
}
