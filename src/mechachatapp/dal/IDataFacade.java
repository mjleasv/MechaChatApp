package mechachatapp.dal;

import java.util.List;
import mechachatapp.be.Message;

/**
 *
 * @author mjl
 */
public interface IDataFacade 
{
    Message logMessage(String msg);
    List<Message> getMessages();
}


/*
IDataFacade dal = new IDataFacade()
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
*/