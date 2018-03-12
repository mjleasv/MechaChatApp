/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.dal.facade;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import mechachatapp.be.Message;
import mechachatapp.dal.database.DBConnector;
import mechachatapp.dal.database.MessageDAO;
import mechachatapp.dal.exceptions.DalException;

/**
 *
 * @author pgn
 */
public class MCDatabaseDalFacade implements IMechaChatDalFacade
{

    private DBConnector connector;
    private MessageDAO msgDao;

    public MCDatabaseDalFacade() throws DalException
    {
        try
        {
            connector = new DBConnector();
            msgDao = new MessageDAO();
        } catch (IOException ex)
        {
            throw new DalException("Could not establish a connection to the database", ex);
        }
    }

    @Override
    public Message createMessage(String msg) throws DalException
    {
        try (Connection con = connector.getConnection())
        {
            Message message = msgDao.createMessage(con, msg);
            return message;
        } catch (SQLException ex)
        {
            throw new DalException("Could not create new message", ex);
        }
    }

    @Override
    public void deleteMessage(Message message) throws DalException
    {
        try (Connection con = connector.getConnection())
        {
            msgDao.deleteMessage(con, message);
        } catch (SQLException ex)
        {
            throw new DalException("Could not create new message", ex);
        }
    }

    @Override
    public List<Message> readAllMessages() throws DalException
    {
        try (Connection con = connector.getConnection())
        {
            return msgDao.getAllMessages(con);
        } catch (SQLException ex)
        {
            throw new DalException("Could not read all messages from database", ex);
        }
    }

}
