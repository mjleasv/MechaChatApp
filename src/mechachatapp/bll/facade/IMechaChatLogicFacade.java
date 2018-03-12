/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll.facade;

import java.util.List;
import mechachatapp.be.Message;
import mechachatapp.bll.exceptions.BllException;

/**
 *
 * @author pgn
 */
public interface IMechaChatLogicFacade
{

    public void deleteMessage(Message message) throws BllException;

    public List<Message> getAllMessages() throws BllException;

    public Message logMessage(String msg) throws BllException;

}
