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
public class UserNameValidationTest
{
    
    public UserNameValidationTest()
    {
    }

    /**
     * Test of validateInput method, of class UserNameValidation.
     */
    @Test
    public void testValidateInputPeter()
    {
        String input = "Peter";
        UserNameValidation instance = new UserNameValidation();
        boolean expResult = true;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of validateInput method, of class UserNameValidation.
     */
    @Test
    public void testValidateInputFWord()
    {
        String input = "UfucKanban";
        UserNameValidation instance = new UserNameValidation();
        boolean expResult = false;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of validateInput method, of class UserNameValidation.
     */
    @Test
    public void testValidateInputPewDiePie()
    {
        String input = "PewDiePie";
        UserNameValidation instance = new UserNameValidation();
        boolean expResult = false;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }
    
}
