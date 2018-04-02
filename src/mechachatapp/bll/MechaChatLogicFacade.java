/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll;

import java.util.ArrayList;
import java.util.List;
import mechachatapp.be.Message;
import mechachatapp.be.User;
import mechachatapp.dal.IMechaChatDataFacade;
import mechachatapp.dal.XMLMechaChatDataFacade;

/**
 *
 * @author mjl
 */
public class MechaChatLogicFacade implements IMechaChatLogicFacade 
{
    //Singleton
    private static MechaChatLogicFacade instance = null;

    public static MechaChatLogicFacade getInstance() 
    {
        if(instance == null)
        {
            //Only generate an instance once!
            instance = new MechaChatLogicFacade();
        }
        
        return instance;
    }
    
    IMechaChatDataFacade dal;
    
    private MechaChatLogicFacade()
    {
        //Private constructor, that no one outside can use!
        dal = new XMLMechaChatDataFacade();
    }
    

    @Override
    public Message logMessage(String msg, int userId) {
        return dal.logMessage(msg, userId);
    }

    @Override
    public List<Message> getMessages() {
        return dal.getMessages();
    }

    @Override
    public boolean removeMessage(Message msg) {
        return dal.removeMessage(msg);
    }

    @Override
    public List<Message> getMessages(int userId) {
        return dal.getMessages(userId);
    }

    @Override
    public User login(String username, String passwordSalt) {
        return dal.login(username, passwordSalt);
    }

    @Override
    public User createUser(String username, String email, String passwordSalt) {
        return dal.createUser(username, email, passwordSalt);
    }
    
}