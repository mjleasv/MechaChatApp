/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author pgn
 */
public class MechaChatApp extends Application
{

    @Override
    public void start(Stage stage) throws Exception
    {
        //Parent root = FXMLLoader.load(getClass().getResource("/mechachatapp/gui/view/MessageLogView.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("/mechachatapp/gui/view/CreateUserView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
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
