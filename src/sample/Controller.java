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
        window.setScene(new Scene(ChangeScene, window.getWidth(), window.getHeight()));
        window.show();
    }

    public void toSettings(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent SettingLayout = FXMLLoader.load(getClass().getResource("settingmenu.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(SettingLayout, window.getWidth(), window.getHeight()));
        window.show();
    }

    public void BackToMainScene(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent MainLayout = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(MainLayout, window.getWidth(), window.getHeight()));
        window.show();
    }

    public void toWelcomePicture(ActionEvent event) throws IOException {
        //Getting the layout from file
        Parent welcomePictureLayout = FXMLLoader.load(getClass().getResource("welcomePicture.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(welcomePictureLayout, window.getWidth(), window.getHeight()));
        window.show();
    }

    public void toMap(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent mapLayout = FXMLLoader.load(getClass().getResource("map.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(mapLayout, window.getWidth(), window.getHeight()));
        window.show();
    }

    public void toArea1(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area1Layout = FXMLLoader.load(getClass().getResource("area1.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(area1Layout, window.getWidth(), window.getHeight()));
        window.show();
    }




    public void toArea2(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area2Layout = FXMLLoader.load(getClass().getResource("area2.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(area2Layout, window.getWidth(), window.getHeight()));
        window.show();
    }

    public void toArea3(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area3Layout = FXMLLoader.load(getClass().getResource("area3.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(area3Layout, window.getWidth(), window.getHeight()));
        window.show();
    }

    public void toArea4(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area4Layout = FXMLLoader.load(getClass().getResource("area4.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(area4Layout, window.getWidth(), window.getHeight()));
        window.show();
    }

    public void toArea1a(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area1aLayout = FXMLLoader.load(getClass().getResource("area1a.fxml"));
        //Used to get the current window
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(area1aLayout, window.getWidth(), window.getHeight()));
        window.show();
    }

}