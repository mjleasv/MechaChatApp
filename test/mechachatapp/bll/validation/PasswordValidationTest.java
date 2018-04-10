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
     * Test of validateInput method, of class InputLengthValidation.
     */
    @Test
    public void testValidateInputShort()
    {
        String input = "IMSHORT";
        InputLengthValidation instance = new InputLengthValidation(InputLengthValidation.MINIMUM_PASSWORD_LENGTH, true);
        boolean expResult = false;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class InputLengthValidation.
     */
    @Test
    public void testValidateInputLongEnough()
    {
        String input = "IMLONGER";
        InputLengthValidation instance = new InputLengthValidation(InputLengthValidation.MINIMUM_PASSWORD_LENGTH, true);
        boolean expResult = true;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class InputLengthValidation.
     */
    @Test
    public void testValidateInputNameNotTooLong()
    {
        String input = "12345678901234567890123456789012345678901234567890"; //50 chars
        InputLengthValidation instance = new InputLengthValidation(InputLengthValidation.MAXIMUM_USER_NAME_LENGTH, false);
        boolean expResult = true;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class InputLengthValidation.
     */
    @Test
    public void testValidateInputNameTooLong()
    {
        String input = "123456789012345678901234567890123456789012345678901"; //51 chars
        InputLengthValidation instance = new InputLengthValidation(InputLengthValidation.MAXIMUM_USER_NAME_LENGTH, false);
        boolean expResult = false;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }

}
