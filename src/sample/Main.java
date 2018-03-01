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

import java.util.Objects;

import static javafx.scene.paint.Color.LIGHTSKYBLUE;


public class Main extends Application  implements EventHandler<ActionEvent>{

    //univeral buttons and scenes
    Stage window;
    Scene scene1;
    Scene scene2;
    Button LoginButton;
    TextField nameInput;
    TextField passwordInput;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //window settings
        window = primaryStage;
        window.setTitle("AKidemia");
        window.setFullScreen(true);


        //Grid panle settings
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);
        grid.setBackground(new Background(new BackgroundFill(Color.LIGHTSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        //grid.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(new ImagePattern(new Image(Objects.requireNonNull(getClass().getClassLoader().getResource("file:/Users/Aidensmac/IdeaProjects/Shit/Shit.iml").toString()))),
          //      CornerRadii.EMPTY, Insets.EMPTY)}));

        // go label
        Label label1 = new Label("Welcome to Akidemia");
        GridPane.setConstraints(label1, 50, 40);


        Button goButton = new Button("Go");
        GridPane.setConstraints(goButton, 51, 40);
        goButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(scene2);

            }
        });

        // Layout 1
        GridPane layout1 = new GridPane();
        layout1.setPadding(new Insets(10,10,10,10));
        layout1.setVgap(8);
        layout1.setHgap(10);
        layout1.getChildren().addAll(label1, goButton);


        BorderPane pane1 = new BorderPane();
        pane1.setCenter(layout1);
        scene1 = new Scene(pane1);
        //Name label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 25, 20);

        //Name input
        nameInput = new TextField();
        nameInput.setPromptText("Username");
        GridPane.setConstraints(nameInput, 26,20);

        //Password label
        Label passwordLabel = new Label("Password :");
        GridPane.setConstraints(passwordLabel, 25 ,21);

        //Password input
        passwordInput = new TextField();
        passwordInput.setPromptText("Password");
        GridPane.setConstraints(passwordInput, 26, 21);

        //Login button
        LoginButton = new Button("Log In");
        GridPane.setConstraints(LoginButton, 26, 22);
        LoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Login: " + nameInput.getText());
                System.out.println("Password: " + passwordInput.getText());
            }
        });

        //Back button
        Button BackButton = new Button("Back");
        GridPane.setConstraints(BackButton, 0, 0);

        BackButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(scene1);

            }
        });


        //grid.getChildren().addAll(nameLabel, nameInput, passwordLabel, passwordInput, LoginButton, BackButton);

        GridPane layout2 = new GridPane();
        layout2.setPadding(new Insets(10,10,10,10));
        layout2.setVgap(8);
        layout2.setHgap(10);
        layout2.getChildren().addAll(nameLabel, nameInput, passwordLabel, passwordInput, LoginButton, BackButton);
        scene2 = new Scene(layout2);

        window.setScene(scene1);

        window.show();

    }
    //Button functionality
    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == LoginButton)
        {
            System.out.println("Login: " + nameInput.getText());
            System.out.println("Password: " + passwordInput.getText());
        }
    }

    //Used to check if the input was an integer
    private boolean isInt(TextField input, String message)
    {
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("User is: " + age);
            return true;
        }catch(NumberFormatException e){
            System.out.println("Error: " + message + " is not type number");
            return false;
        }
    }



}