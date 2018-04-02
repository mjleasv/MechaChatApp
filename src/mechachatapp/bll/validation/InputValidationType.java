/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll.validation;

/**
 *
 * @author mjl
 */
public enum InputValidationType
{
    VALIDATE_USERNAME,
    VALIDATE_PASSWORD,
    VALIDATE_EMAIL,
    VALIDATE_PHONE_NUMBER,
    VALIDATE_NOT_EMPTY,
    VALIDATE_NO_BANNED_WORDS,
}
