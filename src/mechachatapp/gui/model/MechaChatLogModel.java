package mechachatapp.gui.model;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mechachatapp.be.Message;
import mechachatapp.bll.IMechaChatLogicFacade;
import mechachatapp.bll.MechaChatLogicFacade;

/**
 *
 * @author pgn & 
 */
public class MechaChatLogModel
{

    private final IMechaChatLogicFacade facade;

    private ObservableList<Message> messages;

    public MechaChatLogModel()
    {
        messages = FXCollections.observableArrayList();

        facade = MechaChatLogicFacade.getInstance();
        
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
