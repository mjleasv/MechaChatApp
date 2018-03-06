/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.bll.facade;

import java.util.ArrayList;
import java.util.List;
import mechachatapp.be.Message;

/**
 *
 * @author pgn
 */
public class MCLogicFacade implements IMechaChatLogicFacade
{

    private static MCLogicFacade INSTANCE;

    private int id = 1;

    private MCLogicFacade()
    {

    }

    public synchronized static MCLogicFacade getInstance()
    {
        if (INSTANCE == null)
        {
            INSTANCE = new MCLogicFacade();
        }
        return INSTANCE;
    }

    @Override
    public List<Message> getAllMessages()
    {
        ArrayList<Message> msgs = new ArrayList<>();
        msgs.add(logMessage("Hello world"));
        msgs.add(logMessage("How are you?"));
        msgs.add(logMessage("Fine thank you."));
        msgs.add(logMessage("Bye bye"));
        return msgs;
    }

    @Override
    public Message logMessage(String msg)
    {
        return new Message(id++, msg);
    }

}
