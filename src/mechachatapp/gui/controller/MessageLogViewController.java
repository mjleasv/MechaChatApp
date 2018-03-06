/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import mechachatapp.be.Message;
import mechachatapp.gui.model.MechaChatLogModel;

/**
 *
 * @author pgn
 */
public class MessageLogViewController implements Initializable
{
    
    @FXML
    private ListView<Message> lstMessages;
    @FXML
    private TextField txtMessage;
    
    private MechaChatLogModel model;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        model = new MechaChatLogModel();
        lstMessages.setItems(model.getMessages());
    }    

    @FXML
    private void handleSendMessage(ActionEvent event)
    {
        String txt = txtMessage.getText();
        model.logMessage(txt);
        txtMessage.clear();
    }
    
}
