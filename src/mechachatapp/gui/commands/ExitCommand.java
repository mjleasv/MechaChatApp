/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.commands;

import javafx.application.Platform;

/**
 *
 * @author mjl
 */
public class ExitCommand implements ICommand {

    @Override
    public void execute() {
        //TODO: Consider saving last unsent message or other user settings
        Platform.exit();
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
