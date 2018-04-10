/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll.exceptions;

/**
 *
 * @author pgn
 */
public class BllException extends Exception
{

    public BllException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public BllException(String message)
    {
        super(message);
    }

}
