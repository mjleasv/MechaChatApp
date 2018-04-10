package mechachatapp.gui.model;

import java.util.Iterator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mechachatapp.be.Message;
import mechachatapp.be.MessageTypes;
import mechachatapp.be.User;
import mechachatapp.bll.IMechaChatLogicFacade;
import mechachatapp.bll.MechaChatLogicFacade;

/**
 *
 * @author pgn & mjlª
 */
public class MechaChatLogModel
{
    private User currentUser;

    private final IMechaChatLogicFacade facade;

    private ObservableList<Message> messages;
    
    private ObservableList<Message> textFilter;
    private ObservableList<Message> imageFilter;
    private ObservableList<Message> tweetFilter;
    private ObservableList<Message> linkFilter;

    public MechaChatLogModel()
    {
        this.linkFilter = FXCollections.observableArrayList();
        this.tweetFilter = FXCollections.observableArrayList();
        this.imageFilter = FXCollections.observableArrayList();
        this.textFilter = FXCollections.observableArrayList();
        
        currentUser = new User(0, "test", "test@test.dk");
        
        messages = FXCollections.observableArrayList();

        facade = MechaChatLogicFacade.getInstance();
        
        //messages.addAll(facade.getMessages());
        messages.addAll(facade.getMessages(currentUser.getId()));
        
        filterMessagesByType();
        
        
    }

    public void gotoSoloMessages()
    {
        messages.clear();
        messages.addAll(facade.getMessages(currentUser.getId()));
        filterMessagesByType();
    }
    
    public void gotoAllMessages()
    {
        messages.clear();
        messages.addAll(facade.getMessages());
        filterMessagesByType();
    }
    
    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    
    public ObservableList<Message> getMessages()
    {
        return messages;
    }
    
    public User createUser(String username, String email, String password)
    {
        return facade.createUser(username, email, password);
    }
    
    public User loginUser(String username, String password)
    {
        return facade.login(username, password);
    }
   
    public Message logMessage(String text)
    {
        Message msg = facade.logMessage(text, currentUser.getId());
        messages.add(msg);
        
        filterMessagesByType();
        
        return msg;
    }
    
    public boolean removeMessage(Message msg)
    {
        if(facade.removeMessage(msg))
        {
            messages.remove(msg);
            return true;
        } 
        else
        {
            //Report something went wrong...
            return false;
        }
    }

    private void filterMessagesByType() {
        Iterator iter = new MessageTypes();
        
        while(iter.hasNext())
        {
            MessageTypes.MessageType currentType = (MessageTypes.MessageType)iter.next();
            for (Message message : messages) {
                //filter based on type into the lists.
               
            }
        }
    }

}
