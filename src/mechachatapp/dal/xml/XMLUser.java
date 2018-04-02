/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.dal.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author mjl
 */
public class XMLUser {
    int id;
    String username;
    String email;
    String passwordSalt;

    public XMLUser(int id, String username, String email, String passwordSalt) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.passwordSalt = passwordSalt;
    }
    
    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    @XmlElement
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    @XmlElement
    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }
    
}
