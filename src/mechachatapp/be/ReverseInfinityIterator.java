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
public class ReverseInfinityIterator implements Iterator<User> {
    private final ArrayList<User> users;

    private int currentIndex = 0;
    
    public ReverseInfinityIterator(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public User next() {
        if(currentIndex < 0)
        {
            currentIndex = users.size() - 1;
        }
        
        return users.get(currentIndex--);
    }  
}
