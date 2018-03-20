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
public class AbstractValidationTest
{

    public AbstractValidationTest()
    {
    }

    /**
     * Test of getValidationMessage method, of class AbstractValidation.
     */
    @Test
    public void testGetValidationMessage()
    {
        System.out.println("getValidationMessage");
        AbstractValidation instance = new AbstractValidationImpl();
        String expResult = "Valid";
        instance.validateInput(expResult);
        String result = instance.getValidationMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValidationMessage method, of class AbstractValidation.
     */
    @Test
    public void testGetValidationMessageNoMessage()
    {
        System.out.println("getValidationMessage");
        AbstractValidation instance = new AbstractValidationImpl();
        String expResult = "";
        String result = instance.getValidationMessage();
        assertEquals(expResult, result);
    }

    public class AbstractValidationImpl extends AbstractValidation
    {

        @Override
        public boolean validateInput(String input)
        {
            validationMessage = input;
            return true;
        }

    }

}
