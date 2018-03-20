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

/**
 *
 * @author pgn
 */
public class UserModel
{

    private IMechaChatLogicFacade logicFacade;

    public UserModel() throws BllException
    {
        logicFacade = MCLogicFacade.getInstance();
    }

    public User createNewUser(String userName, String email, String password) throws BllException
    {
        User user = logicFacade.createUSer(userName, email, password);
        return user;
    }

    public Object getLoggedInUser()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}