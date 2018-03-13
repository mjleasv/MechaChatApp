/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.commands;

/**
 *
 * @author mjl
 */
public interface IUndoableCommand extends ICommand {
    void undo();
    void redo();
}
