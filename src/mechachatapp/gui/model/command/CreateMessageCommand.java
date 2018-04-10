/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.model.command;

import mechachatapp.be.Message;
import mechachatapp.bll.exceptions.BllException;
import mechachatapp.gui.model.MechaChatLogModel;

/**
 *
 * @author pgn
 */
public class CreateMessageCommand implements ICommand
{

    private MechaChatLogModel receiver;
    private Message message;
    private String text;

    public CreateMessageCommand(MechaChatLogModel receiver, String text)
    {
        this.receiver = receiver;
        this.text = text;
    }

    @Override
    public void execute() throws BllException
    {
        message = receiver.logMessage(text);
    }

    @Override
    public void undo() throws BllException
    {
        receiver.deleteMessage(message);
    }

}
