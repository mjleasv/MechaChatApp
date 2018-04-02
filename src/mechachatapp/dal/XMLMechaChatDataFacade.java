/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.dal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import mechachatapp.be.Message;
import mechachatapp.be.User;
import mechachatapp.dal.xml.XMLDatabase;
import mechachatapp.dal.xml.XMLMessage;
import mechachatapp.dal.xml.XMLUser;

/**
 *
 * @author mjl
 */
public class XMLMechaChatDataFacade implements IMechaChatDataFacade {
    
    XMLDatabase db;

    public XMLMechaChatDataFacade() {
        
        if(!LoadDatabase())
        {
            db = new XMLDatabase();
        }
    }
    
    private boolean LoadDatabase()
    {
        String path = System.getProperty("user.home") + File.separator + "mechachatapp" + File.pathSeparator + "database.xml";
        File dbfile = new File(path);
        System.out.println("Path: "+path);
        
        if(dbfile.exists())
        {
            try {
                JAXBContext jc = JAXBContext.newInstance(XMLDatabase.class);
                
                Unmarshaller jaxbUnmarshaller = jc.createUnmarshaller();
		XMLDatabase database = (XMLDatabase) jaxbUnmarshaller.unmarshal(dbfile);
                
                db = database;
                
            } catch (JAXBException ex) {
                Logger.getLogger(XMLMechaChatDataFacade.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
            return true;
        }
        
        return false;
    }
    
    private void SaveDatabase()
    {
        String path = System.getProperty("user.home") + File.separator + "mechachatapp" + File.pathSeparator + "database.xml";
        File dbfile = new File(path);
        
        try {
            JAXBContext jc = JAXBContext.newInstance(XMLDatabase.class);

            Marshaller jaxbMarshaller = jc.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(db, dbfile);

        } catch (JAXBException ex) {
            Logger.getLogger(XMLMechaChatDataFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Message logMessage(String msg, int userId) {
        Message m = new Message(db.messages.size(), msg, userId);
        XMLMessage xmlmsg = new XMLMessage();
        xmlmsg.setId(m.getId());
        xmlmsg.setText(msg);
        
        db.messages.add(xmlmsg);
        
        SaveDatabase();
        
        return m;
    }

    @Override
    public boolean removeMessage(Message msg) {
        
        for (int i = 0; i < db.messages.size(); i++) {
            if(db.messages.get(i).getId() == msg.getId())
            {
                db.messages.remove(i);
                return true;
            }
        }
        
        //We didn't find that message
        return false;
    }

    @Override
    public List<Message> getMessages() {
        List<Message> list = new ArrayList<>();
        
        for (XMLMessage message : db.messages) {
            list.add(new Message(message.getId(), message.getText(), message.getUserId()));
        }
        
        return list;
    }

    @Override
    public List<Message> getMessages(int userId) {
        List<Message> list = new ArrayList<>();
        
        for (XMLMessage message : db.messages) {
            //Filter out other users messages.
            if(message.getUserId() != userId) continue;
            list.add(new Message(message.getId(), message.getText(), message.getUserId()));
        }
        
        return list;
    }

    @Override
    public User login(String username, String passwordSalt) {
        for (XMLUser user : db.users) {
            if(user.getUsername().equalsIgnoreCase(username) && user.getPasswordSalt().equals(passwordSalt))
            {
                return new User(user.getId(), user.getUsername(), user.getEmail());
            }
        }
        
        //username or password not correct
        return null;
    }

    @Override
    public User createUser(String username, String email, String passwordSalt) {
        //TODO: verify the user doesn't already exist
        
        XMLUser u = new XMLUser(db.users.size(), username, email, passwordSalt);
        
        db.users.add(u);
        
        return new User(u.getId(), u.getUsername(), u.getEmail());
    }
    
}
