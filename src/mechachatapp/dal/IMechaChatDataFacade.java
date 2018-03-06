package mechachatapp.dal;

import java.util.List;
import mechachatapp.be.Message;

/**
 *
 * @author mjl
 */
public interface IMechaChatDataFacade 
{
    Message logMessage(String msg);
    List<Message> getMessages();
}