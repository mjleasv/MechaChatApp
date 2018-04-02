/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.be;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author pgn
 */
public class Message
{
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty text = new SimpleStringProperty();
    private final IntegerProperty userId = new SimpleIntegerProperty();
    
    public Message(int id, String text, int userId)
    {
        this.id.setValue(id);
        this.text.setValue(text);
        this.userId.setValue(userId);
    }
    
    public int getId()
    {
        return id.get();
    }
    
    public IntegerProperty idProperty()
    {
        return id;
    }
    
    public String getText()
    {
        return text.get();
    }
    
    public void setText(String value)
    {
        text.set(value);
    }
    
    public StringProperty textProperty()
    {
        return text;
    }
    
    public int getUserId()
    {
        return userId.get();
    }
    
    public IntegerProperty getUserIdProperty() {
        return userId;
    }
    
    public void setUserId(int value)
    {
        userId.set(value);
    }
    
    @Override
    public String toString(){
        return getText();
    }
    
}
