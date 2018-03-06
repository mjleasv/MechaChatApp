package mechachatapp.bll;

import java.util.List;
import mechachatapp.be.Message;

/**
 *
 * @author pgn
 */
public interface IMechaChatLogicFacade
{

    public Message logMessage(String msg); 
    public List<Message> getMessages();

}
