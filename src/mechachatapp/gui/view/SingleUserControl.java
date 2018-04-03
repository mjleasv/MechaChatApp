/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechachatapp.gui.view;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import mechachatapp.be.User;

/**
 *
 * @author pgn
 */
public class SingleUserControl extends BorderPane
{

    @FXML
    private ImageView imgAvatar;
    @FXML
    private Label lblUserName;

    private final User user;

    public SingleUserControl(User user, Image image)
    {
        this.user = user;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SingleUserView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try
        {
            fxmlLoader.load();
            lblUserName.textProperty().bind(user.nameProperty());
            imgAvatar.setImage(image);
        } catch (IOException exception)
        {
            throw new RuntimeException(exception);
        }
    }

    public User getUser()
    {
        return user;
    }

}
