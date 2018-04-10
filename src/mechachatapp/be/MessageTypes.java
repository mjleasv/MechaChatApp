/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.be;

import java.util.Iterator;

/**
 *
 * @author mjl
 */
public class MessageTypes implements Iterator {

    public class MessageType {
        String type;
        int maxSize; 
        boolean containsImage;

        public MessageType(String type, int size, boolean containsImage) {
            this.type = type;
            this.maxSize = size;
            this.containsImage = containsImage;
        }
    }
    
    private MessageType TextMessage = new MessageType("rawtext", Integer.MAX_VALUE, false);
    private MessageType PictureMessage = new MessageType("picture", 1024, true);
    private MessageType TweetMessage = new MessageType("tweet", 256, false);
    private MessageType LinkMessage = new MessageType("link", 65536, false);
    private MessageType SoundMessage = new MessageType("sound", 65536, true);
    
    private int currentIndex = 0;
    private final int messageTypeCount = 5;
    
    @Override
    public boolean hasNext() {
        return currentIndex < messageTypeCount;
    }

    @Override
    public MessageType next() {
        
        switch(currentIndex++)
        {
            case 0:
                return TextMessage;
            case 1:
                return PictureMessage;
            case 2:
                return TweetMessage;
            case 3:
                return LinkMessage;
            case 4:
                return SoundMessage;
            default:
                return null;
        }
    }
    
    public void reset(){
        currentIndex = 0;
    }
}
