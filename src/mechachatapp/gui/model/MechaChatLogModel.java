/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mechachatapp.be.Message;
import mechachatapp.bll.IMechaChatLogicFacade;

/**
 *
 * @author pgn
 */
public class MechaChatLogModel
{

    private IMechaChatLogicFacade facade;

    private ObservableList<Message> messages;

    public MechaChatLogModel()
    {
        messages = FXCollections.observableArrayList();

        facade = new IMechaChatLogicFacade()
        {

            @Override
            public Message logMessage(String msg)
            {
                return new Message(0, msg);
            }
        };
    }

    public ObservableList<Message> getMessages()
    {
        return messages;
    }

    public void logMessage(String text)
    {
        Message msg = facade.logMessage(text);
        messages.add(msg);
    }

}
