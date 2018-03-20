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
    public void testAndValidationTrueTrue()
    {
        AndValidation instance = new AndValidation(new TrueValidation(), new TrueValidation());
        boolean expResult = true;
        boolean result = instance.validateInput("");
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class AndValidation.
     */
    @Test
    public void testAndValidationFalseFalse()
    {
        AndValidation instance = new AndValidation(new FalseValidation(), new FalseValidation());
        boolean expResult = false;
        boolean result = instance.validateInput("");
        System.out.println("False False Msg:");
        System.out.println(instance.getValidationMessage());
        System.out.println("");
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class AndValidation.
     */
    @Test
    public void testAndValidationTrueFalse()
    {
        AndValidation instance = new AndValidation(new TrueValidation(), new FalseValidation());
        boolean expResult = false;
        boolean result = instance.validateInput("");
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class AndValidation.
     */
    @Test
    public void testAndValidationFalseTrue()
    {
        AndValidation instance = new AndValidation(new FalseValidation(), new TrueValidation());
        boolean expResult = false;
        boolean result = instance.validateInput("");
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class AndValidation.
     */
    @Test
    public void testAndValidationTrueTrueFalse()
    {
        AndValidation instance = new AndValidation(new AndValidation(new TrueValidation(), new TrueValidation()), new FalseValidation());
        boolean expResult = false;
        boolean result = instance.validateInput("");
        System.out.println("True True False Msg:");
        System.out.println(instance.getValidationMessage());
        System.out.println("");
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class AndValidation.
     */
    @Test
    public void testAndValidationFalseFalseFalse()
    {
        AndValidation instance = new AndValidation(new AndValidation(new FalseValidation(), new FalseValidation()), new FalseValidation());
        boolean expResult = false;
        boolean result = instance.validateInput("");
        System.out.println("False False False Msg:");
        System.out.println(instance.getValidationMessage());
        System.out.println("");
        assertEquals(expResult, result);
    }

    /**
     * Test of validateInput method, of class AndValidation.
     */
    @Test
    public void testAndValidationFalseTrueTrue()
    {
        AndValidation instance = new AndValidation(new AndValidation(new FalseValidation(), new TrueValidation()), new TrueValidation());
        boolean expResult = false;
        boolean result = instance.validateInput("");
        System.out.println("False True True Msg:");
        System.out.println(instance.getValidationMessage());
        System.out.println("");
        assertEquals(expResult, result);
    }

    @Test
    public void testManyPasswordRulesChange()
    {
        AndValidation instance = new AndValidation(new AndValidation(new PasswordLengthValidation(), new PasswordContainsSpecialChars()), new PasswordNotTopTenValidation());
        String badPassword = "google";
        String goodPassword = "apmf123!#GGhe";
        instance.validateInput(badPassword);
        boolean result = instance.validateInput(goodPassword);
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    @Test
    public void testManyPasswordRulesChangeMsgTest()
    {
        AndValidation instance = new AndValidation(new AndValidation(new PasswordLengthValidation(), new PasswordContainsSpecialChars()), new PasswordNotTopTenValidation());
        String badPassword = "google";
        String goodPassword = "apmf123!#GGhe";
        instance.validateInput(badPassword);
        instance.validateInput(goodPassword);
        String msg = instance.getValidationMessage();
        String expMsg = "";
        assertEquals(expMsg, msg);
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

    private class FalseValidation extends AbstractValidation
    {

        @Override
        public boolean validateInput(String input)
        {
            validationMessage = "False";
            return false;
        }

    }

}
