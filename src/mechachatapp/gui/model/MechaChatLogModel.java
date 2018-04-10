/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.model;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mechachatapp.be.Message;
import mechachatapp.bll.exceptions.BllException;
import mechachatapp.bll.facade.IMechaChatLogicFacade;
import mechachatapp.bll.facade.MCLogicFacade;

/**
 *
 * @author pgn
 */
public class MechaChatLogModel
{

    private IMechaChatLogicFacade facade;

    private ObservableList<Message> messages;

    public MechaChatLogModel() throws BllException
    {
        messages = FXCollections.observableArrayList();
        facade = MCLogicFacade.getInstance();
        messages.addAll(facade.getAllMessages());
    }

    public void deleteMessage(Message message) throws BllException
    {
        facade.deleteMessage(message);
        messages.remove(message);
    }

    /**
     * Get a list of all the messages in the log.
     *
     * @return
     */
    public ObservableList<Message> getMessages()
    {
        return messages;
    }

    /**
     * Adds a new message to the log.
     *
     * @param text The text of the message.
     * @return
     * @throws BllException
     */
    public Message logMessage(String text) throws BllException
    {
        Message msg = facade.logMessage(text);
        messages.add(msg);
        return msg;
    }

}
