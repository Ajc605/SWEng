package sample;


//import java.awt.event.ActionEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public void PressGo(ActionEvent event) throws IOException {

        System.out.println("Go");
        //Getting the layout from file
        Parent ChangeScene = FXMLLoader.load(getClass().getResource("ChooseYourAdventure.fxml"));
        //Making a new scene with new layout
        Scene LoginScene = new Scene(ChangeScene);
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(LoginScene);
        window.show();
    }

    public void BackToMainScene(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent MainLayout = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Making a new scene with new layout
        Scene mainScene  = new Scene(MainLayout);
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }

    public void toWelcomePicture(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent welcomePictureLayout = FXMLLoader.load(getClass().getResource("welcomePicture.fxml"));
        //Making a new scene with new layout
        Scene welcomePictureScene  = new Scene(welcomePictureLayout);
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(welcomePictureScene);
        window.show();
    }

    public void toMap(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent mapLayout = FXMLLoader.load(getClass().getResource("map.fxml"));
        //Making a new scene with new layout
        Scene mapScene  = new Scene(mapLayout);
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mapScene);
        window.show();
    }




}