package mechachatapp.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mechachatapp.be.Message;
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

    public MechaChatLogModel()
    {
        currentUser = new User(0, "test", "test@test.dk");
        
        messages = FXCollections.observableArrayList();

        facade = MechaChatLogicFacade.getInstance();
        
        //messages.addAll(facade.getMessages());
        messages.addAll(facade.getMessages(currentUser.getId()));
    }

    public void gotoSoloMessages()
    {
        messages.clear();
        messages.addAll(facade.getMessages(currentUser.getId()));
    }
    
    public void gotoAllMessages()
    {
        messages.clear();
        messages.addAll(facade.getMessages());
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

}
