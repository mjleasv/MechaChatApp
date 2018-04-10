/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.be;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author pgn
 */
public class User
{

    private final ReadOnlyIntegerWrapper id;
    private final StringProperty email = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();

    public User(int id, String userName, String email)
    {
        this.id = new ReadOnlyIntegerWrapper(id);
    }

    public int getId()
    {
        return id.get();
    }

    public ReadOnlyIntegerProperty idProperty()
    {
        return id;
    }

    public String getName()
    {
        return name.get();
    }

    public void setName(String value)
    {
        name.set(value);
    }

    public StringProperty nameProperty()
    {
        return name;
    }

    public String getEmail()
    {
        return email.get();
    }

    public void setEmail(String value)
    {
        email.set(value);
    }

    public StringProperty emailProperty()
    {
        return email;
    }

}
