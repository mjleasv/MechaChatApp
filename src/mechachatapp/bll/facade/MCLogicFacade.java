/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll.facade;

import java.util.List;
import mechachatapp.be.Message;
import mechachatapp.be.User;
import mechachatapp.bll.exceptions.BllException;
import mechachatapp.dal.exceptions.DalException;
import mechachatapp.dal.facade.IMechaChatDalFacade;
import mechachatapp.dal.facade.MCDatabaseDalFacade;

/**
 *
 * @author pgn
 */
public class MCLogicFacade implements IMechaChatLogicFacade
{

    private static MCLogicFacade INSTANCE;
    private IMechaChatDalFacade dalFacade;

    private MCLogicFacade() throws BllException
    {
        try
        {
            dalFacade = new MCDatabaseDalFacade();
        } catch (DalException ex)
        {
            throw new BllException("Could not establish a connection to the data acces layer.", ex);
        }
    }

    public synchronized static MCLogicFacade getInstance() throws BllException
    {
        if (INSTANCE == null)
        {
            INSTANCE = new MCLogicFacade();
        }
        return INSTANCE;
    }

    @Override
    public void deleteMessage(Message message) throws BllException
    {
        try
        {
            dalFacade.deleteMessage(message);
        } catch (DalException ex)
        {
            throw new BllException(ex.getMessage(), ex);
        }
    }

    @Override
    public List<Message> getAllMessages() throws BllException
    {
        try
        {
            return dalFacade.readAllMessages();
        } catch (DalException ex)
        {
            throw new BllException(ex.getMessage(), ex);
        }
    }

    @Override
    public Message logMessage(String msg) throws BllException
    {
        try
        {
            return dalFacade.createMessage(msg);
        } catch (DalException ex)
        {
            throw new BllException(ex.getMessage(), ex);
        }

    }

    @Override
    public User createUSer(String userName, String email, String password) throws BllException
    {
        return new User(1, "Peter", "pgn@email.dk");
    }

}
