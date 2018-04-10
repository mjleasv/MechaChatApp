/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.be;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mjl
 */
public class IterTest implements Iterator<String> {

    private final String[] strings;
    private final List<String> objs;

    public IterTest(String[] strings, List<String> objs) {
        this.strings = strings;
        this.objs = objs;
        
    }

    private int currentIndex = 0;
    private int currentList = 0;
    
    @Override
    public boolean hasNext() {
        
        if(currentList == 0)
        {
            return currentIndex < strings.length;
        }
       
        return currentIndex < objs.size();
    }

    @Override
    public String next() {
        
        if(currentList == 0)
        {
            if(currentIndex < strings.length)
            {
                return strings[currentIndex++];
            }
            
            currentIndex = 0;
            currentList = 1;
        }
        
        if(currentIndex < objs.size())
        {
            return objs.get(currentIndex);
        }
        
        return null;
    }
    
}
