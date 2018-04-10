/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.be;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mjl
 */
public class InfinityIterator implements Iterator<User> {
    private final ArrayList<User> users;

    private Iterator<User> iter =  null;
    
    public InfinityIterator(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public User next() {
        if(iter == null || !iter.hasNext())
        {
            iter = users.iterator();
        }
        
        return iter.next();
    }  
}
