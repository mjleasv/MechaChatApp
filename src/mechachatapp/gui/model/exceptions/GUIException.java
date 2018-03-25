/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.model.exceptions;

import mechachatapp.bll.exceptions.BllException;

/**
 *
 * @author pgn
 */
public class GUIException extends BllException
{

    public GUIException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public GUIException(String message)
    {
        super(message);
    }

}
