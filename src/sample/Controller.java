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
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Making a new scene with new layout
        Scene LoginScene = new Scene(ChangeScene, window.getWidth(), window.getHeight());
        window.setScene(LoginScene);
        window.show();
    }

    public void BackToMainScene(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent MainLayout = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Making a new scene with new layout
        Scene mainScene  = new Scene(MainLayout, window.getWidth(), window.getHeight());
        window.setScene(mainScene);
        window.show();
    }

    public void toWelcomePicture(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent welcomePictureLayout = FXMLLoader.load(getClass().getResource("welcomePicture.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Making a new scene with new layout
        Scene welcomePictureScene  = new Scene(welcomePictureLayout, window.getWidth(), window.getHeight());
        window.setScene(welcomePictureScene);
        window.show();
    }

    public void toMap(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent mapLayout = FXMLLoader.load(getClass().getResource("map.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Making a new scene with new layout
        Scene mapScene  = new Scene(mapLayout, window.getWidth(), window.getHeight());
        window.setScene(mapScene);
        window.show();
    }

    public void toArea1(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area1Layout = FXMLLoader.load(getClass().getResource("area1.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Making a new scene with new layout
        Scene area1Scene  = new Scene(area1Layout, window.getWidth(), window.getHeight());
        window.setScene(area1Scene);
        window.show();
    }

    public void toArea2(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area2Layout = FXMLLoader.load(getClass().getResource("area2.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Making a new scene with new layout
        Scene area2Scene  = new Scene(area2Layout, window.getWidth(), window.getHeight());
        window.setScene(area2Scene);
        window.show();
    }

    public void toArea3(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area3Layout = FXMLLoader.load(getClass().getResource("area3.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Making a new scene with new layout
        Scene area3Scene  = new Scene(area3Layout, window.getWidth(), window.getHeight());
        window.setScene(area3Scene);
        window.show();
    }

    public void toArea4(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area4Layout = FXMLLoader.load(getClass().getResource("area4.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Making a new scene with new layout
        Scene area4Scene  = new Scene(area4Layout, window.getWidth(), window.getHeight());
        window.setScene(area4Scene);
        window.show();
    }




}