package sample;


//import java.awt.event.ActionEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.image.*;

import java.io.IOException;

import static javafx.scene.image.ImageView.*;

public class Controller {

    public void PressGo(ActionEvent event) throws IOException {

        System.out.println("Go");
        //Getting the layout from file
        Parent ChangeScene = FXMLLoader.load(getClass().getResource("ChooseYourAdventure.fxml"));
        //Making a new scene with new layout
        Scene LoginScene = new Scene(ChangeScene);
        //Used to get the current window
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(LoginScene);
        window.show();
    }

    public void toSettings(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent SettingLayout = FXMLLoader.load(getClass().getResource("settingmenu.fxml"));
        //Making a new scene with new layout
        Scene SettingScene = new Scene(SettingLayout);
        //Used to get the current window
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(SettingScene);
        window.show();
    }

    public void BackToMainScene(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent MainLayout = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Making a new scene with new layout
        Scene mainScene = new Scene(MainLayout);
        //Used to get the current window
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }

    public void toWelcomePicture(ActionEvent event) throws IOException {
        //Getting the layout from file
        Parent welcomePictureLayout = FXMLLoader.load(getClass().getResource("welcomePicture.fxml"));
        //Making a new scene with new layout
        Scene welcomePictureScene = new Scene(welcomePictureLayout);
        //Used to get the current window
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(welcomePictureScene);
        window.show();
    }

    public void toMap(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent mapLayout = FXMLLoader.load(getClass().getResource("map.fxml"));
        //Making a new scene with new layout
        Scene mapScene = new Scene(mapLayout);
        //Used to get the current window
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(mapScene);
        window.show();
    }

    public void toArea1(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area1Layout = FXMLLoader.load(getClass().getResource("area1.fxml"));
        //Making a new scene with new layout
        Scene area1Scene = new Scene(area1Layout);
        magCursor(area1Scene);
        //Used to get the current window
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(area1Scene);
        window.show();
    }


    public void toArea2(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area2Layout = FXMLLoader.load(getClass().getResource("area2.fxml"));
        //Making a new scene with new layout
        Scene area2Scene = new Scene(area2Layout);
        magCursor(area2Scene);
        //Used to get the current window
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(area2Scene);
        window.show();
    }

    public void toArea3(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area3Layout = FXMLLoader.load(getClass().getResource("area3.fxml"));
        //Making a new scene with new layout
        Scene area3Scene = new Scene(area3Layout);
        magCursor(area3Scene);
        //Used to get the current window
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(area3Scene);
        window.show();
    }

    public void toArea4(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area4Layout = FXMLLoader.load(getClass().getResource("area4.fxml"));
        //Making a new scene with new layout
        Scene area4Scene = new Scene(area4Layout);
        magCursor(area4Scene);
        //Used to get the current window
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(area4Scene);
        window.show();
    }

    public void toArea1a(ActionEvent event) throws IOException {

        //Getting the layout from file
        Parent area1aLayout = FXMLLoader.load(getClass().getResource("area1a.fxml"));
        //Making a new scene with new layout
        Scene area1aScene = new Scene(area1aLayout);
        //Used to get the current window
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(area1aScene);
        window.show();
    }


    public void magCursor(Scene x) {
        Image image = new Image(getClass().getResource("MediaSweng/cursor.png").toExternalForm(),
                20, 20, false, true);
        x.setCursor(new ImageCursor(image, 1, 1));
    }

   public void excCursor(MouseEvent evt) {

        Image image = new Image(getClass().getResource("MediaSweng/exclamation.png").toExternalForm(),
               20,20,false,true);
        ((Node)evt.getSource()).getScene().setCursor(new ImageCursor(image, 1, 1));
    }

    public void mag2Cursor(MouseEvent evt) {
        magCursor(((Node)evt.getSource()).getScene());
    }

//    public void unlockAnimation(Stage primaryStage) throws Exception {
//        ImageView.setStyle("-fx-image: url(\"MediaSweng/unlock.png\");");
//    }

}