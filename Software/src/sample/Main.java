package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;

public class Main extends Application {

    Stage window;
    Scene scene1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //window settings
        window = primaryStage;
        window.setTitle("AKidemia");
        window.setFullScreen(!true);

        // go label
        Label label1 = new Label("Welcome to Akidemia");
        GridPane.setConstraints(label1, 0, 1);


        Button goButton = new Button("Go");
        GridPane.setConstraints(goButton, 1, 1);
        goButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("GO");

            }
        });

        // Layout 1
        GridPane layout1 = new GridPane();
        layout1.setPadding(new Insets(10, 10, 10, 10));
        layout1.setVgap(8);
        layout1.setHgap(10);
        layout1.getChildren().addAll(label1, goButton);

        BorderPane pane1 = new BorderPane();
        pane1.setCenter(layout1);
        scene1 = new Scene(pane1);

        window.setScene(scene1);

        window.show();

    }
}
