/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll;

import mechachatapp.be.Message;

/**
 *
 * @author pgn
 */
public interface IMechaChatLogicFacade
{

    public Message logMessage(String msg);

}
