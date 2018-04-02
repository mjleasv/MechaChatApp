/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.commands;

import mechachatapp.gui.model.MechaChatLogModel;

/**
 *
 * @author mjl
 */
public class ResetMessageLogCommand implements IUndoableCommand {

    private final MechaChatLogModel model;

    public ResetMessageLogCommand(MechaChatLogModel model) {
        this.model = model;
    }

    @Override
    public void undo() {
        //clear log
        //add all old messages
    }

    @Override
    public void redo() {
        execute();
    }

    @Override
    public void execute() {
        //save all messages from log
        //remove all messages from log
        //add default messages to log
    }
    
}
