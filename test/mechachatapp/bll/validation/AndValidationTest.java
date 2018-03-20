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
public class AndValidationTest
{
    
    public AndValidationTest()
    {
    }

    /**
     * Test of validateInput method, of class AndValidation.
     */
    @Test
    public void testAndValidationOne()
    {
        String input = "";
        AndValidation instance = null;
        boolean expResult = false;
        boolean result = instance.validateInput(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    private class TrueValidation extends AbstractValidation
    {

        @Override
        public boolean validateInput(String input)
        {
            validationMessage = "";
            return true;
        }
        
    }
    
    
    
}
