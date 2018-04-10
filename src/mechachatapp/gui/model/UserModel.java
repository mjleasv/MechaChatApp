/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.model;

import mechachatapp.be.User;
import mechachatapp.bll.exceptions.BllException;
import mechachatapp.bll.facade.IMechaChatLogicFacade;
import mechachatapp.bll.facade.MCLogicFacade;
import mechachatapp.gui.model.exceptions.GUIException;

/**
 *
 * @author pgn
 */
public class UserModel
{

    private User loggedInUser;

    private IMechaChatLogicFacade logicFacade;

    public UserModel() throws BllException
    {
        logicFacade = MCLogicFacade.getInstance();
    }

    public void createNewUser(String userName, String email, String password) throws BllException
    {
        logicFacade.createUSer(userName, email, password);
    }

    public User getLoggedInUser() throws GUIException
    {
        if (loggedInUser == null)
        {
            throw new GUIException("No user logged in");
        }
        return loggedInUser;
    }

    public void logInUser(String userName, String password) throws BllException
    {
        User user = logicFacade.logInUser(userName, password);
        this.loggedInUser = user;
    }

}
