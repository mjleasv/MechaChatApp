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
public class PasswordContainsSpecialCharsTest
{

    public PasswordContainsSpecialCharsTest()
    {
    }

    /**
     * Test of validateInput method, of class PasswordContainsSpecialChars.
     */
    @Test
    public void testValidateInputWithSpecialChar()
    {
        String input = "aa!aa";
        PasswordContainsSpecialChars instance = new PasswordContainsSpecialChars();
        boolean expResult = true;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class PasswordContainsSpecialChars.
     */
    @Test
    public void testValidateInputWithNoChars()
    {
        String input = "aaaaa";
        PasswordContainsSpecialChars instance = new PasswordContainsSpecialChars();
        boolean expResult = false;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
    }

}
