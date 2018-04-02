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
 * @author mjl
 */
public class User {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty username = new SimpleStringProperty();
    private final StringProperty email = new SimpleStringProperty();

    public User(int id, String username, String email) {
        this.id.setValue(id);
        this.username.setValue(username);
        this.email.setValue(email);
    }
    
    public IntegerProperty getIdProperty() {
        return id;
    }

    public StringProperty getUsernameProperty() {
        return username;
    }

    public StringProperty getEmailProperty() {
        return email;
    }
    
    public int getId() {
        return id.get();
    }

    public String getUsername() {
        return username.get();
    }

    public String getEmail() {
        return email.get();
    }

    public void setUsername(String value) {
        username.setValue(value);
    }

    public void getEmail(String value) {
        email.setValue(value);
    }
}
