/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.commands;

import mechachatapp.be.Message;
import mechachatapp.gui.model.MechaChatLogModel;

/**
 *
 * @author mjl
 */
public class SendTextCommand implements IUndoableCommand {

    private String text;
    private Message message = null;
    private MechaChatLogModel model;
    private boolean hasBeenUndone = false;
    
    public SendTextCommand(MechaChatLogModel model, String text)
    {
       this.text = text;
       this.model = model;
       
    }
    
    @Override
    public void execute() {
        message = model.logMessage(text);
    }

    @Override
    public void undo() {
        if(message != null)
        {
            if(model.removeMessage(message))
            {
                hasBeenUndone = true;
            }
        }
    }

    @Override
    public void redo() {
        //Check to see that a message
        if(message != null && hasBeenUndone)
        {
            execute();
            hasBeenUndone = false;
        }
    }
    
}
