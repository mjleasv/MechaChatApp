/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import mechachatapp.gui.controller.LoginViewController;

/**
 *
 * @author pgn
 */
public class MechaChatApp extends Application
{

    @Override
    public void start(Stage stage) throws Exception
    {
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("/mechachatapp/gui/view/LoginView.fxml"));
        Parent loginRoot = loginLoader.load();
        LoginViewController controller = loginLoader.getController();
        controller.setStage(stage);
        
        Scene loginScene = new Scene(loginRoot);
        
        stage.setScene(loginScene);
        
        //stage.initStyle(StageStyle.UNDECORATED); //Removing borders means the window cannot be moved, unless dragging is implemented.
        //stage.setOnCloseRequest(e -> Platform.exit());
        
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }

}