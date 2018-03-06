package mechachatapp.gui.model;

import java.util.ArrayList;
import java.util.List;
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

    private final IMechaChatLogicFacade facade;

    private ObservableList<Message> messages;

    public MechaChatLogModel()
    {
        messages = FXCollections.observableArrayList();

        facade = new IMechaChatLogicFacade()
        {   
            @Override
            public Message logMessage(String msg)
            {
                return new Message(messages.size(), msg);
            }
            
            @Override
            public List<Message> getMessages()
            {
                List<Message> list = new ArrayList<>();
                list.add(new Message(0, "This is my Message Log."));
                list.add(new Message(1, "There are many others like it, but this one is mine."));
                list.add(new Message(2, "My Message Log is my best friend."));
                list.add(new Message(3, "It is my life."));
                list.add(new Message(4, "I must master it as I must master my life."));
                list.add(new Message(5, "Without me, my Message Log is useless."));
                list.add(new Message(6, "Without my Message Log, I am useless."));
                
                return list;
            }
        };
        
        messages.addAll(facade.getMessages());
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
