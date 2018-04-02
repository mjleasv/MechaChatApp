package mechachatapp.dal;

import java.util.List;
import mechachatapp.be.Message;
import mechachatapp.be.User;

/**
 *
 * @author mjl
 */
public interface IMechaChatDataFacade 
{ 
    User login(String username, String passwordSalt);
    User createUser(String username, String email, String passwordSalt);
   
    Message logMessage(String msg, int userId);
    boolean removeMessage(Message msg);
    List<Message> getMessages();
    List<Message> getMessages(int userId);
    
}