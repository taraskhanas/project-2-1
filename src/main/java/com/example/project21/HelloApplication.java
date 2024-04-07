package com.example.project21;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        AnchorPane root = new AnchorPane();
        root.setPrefSize(600, 350);
        root.setStyle("-fx-background-color: #313335;");

        AnchorPane innerPane = new AnchorPane();
        innerPane.setLayoutX(25);
        innerPane.setLayoutY(25);
        innerPane.setPrefSize(550, 300);
        innerPane.setStyle("-fx-background-color: #232428; -fx-background-radius: 10;");

        HBox hBox = new HBox();

        VBox leftVBox = new VBox();
        leftVBox.setPrefSize(275, 300);

        Pane leftPane1 = new Pane();
        leftPane1.setPrefSize(275, 100);
        TextField firstField = new TextField();
        firstField.setLayoutX(13);
        firstField.setLayoutY(13);
        firstField.setPrefSize(250, 75);
        firstField.setPromptText("1");
        firstField.setStyle("-fx-effect: dropshadow(gaussian, #000000, 20, 0, 0, 5); -fx-background-radius: 10;-fx-focus-color: transparent;");
        leftPane1.getChildren().add(firstField);

        Pane leftPane2 = new Pane();
        leftPane2.setPrefSize(275, 100);
        TextField secondField = new TextField();
        secondField.setLayoutX(13);
        secondField.setLayoutY(13);
        secondField.setPrefSize(250, 75);
        secondField.setPromptText("2");
        secondField.setStyle("-fx-effect: dropshadow(gaussian, #000000, 20, 0, 0, 5); -fx-background-radius: 10;-fx-focus-color: transparent;");
        leftPane2.getChildren().add(secondField);

        Pane leftPane3 = new Pane();
        leftPane3.setPrefSize(275, 100);
        TextField thirdField = new TextField();
        thirdField.setLayoutX(13);
        thirdField.setLayoutY(13);
        thirdField.setPrefSize(250, 75);
        thirdField.setPromptText("3");
        thirdField.setStyle("-fx-effect: dropshadow(gaussian, #000000, 20, 0, 0, 5); -fx-background-radius: 10;-fx-focus-color: transparent;");
        leftPane3.getChildren().add(thirdField);

        leftVBox.getChildren().addAll(leftPane1, leftPane2, leftPane3);

        VBox rightVBox = new VBox();
        rightVBox.setPrefSize(275, 300);

        Pane rightPane1 = new Pane();
        rightPane1.setPrefSize(275, 100);
        Button copyFirstToSecondButton = new Button("1 > 2");
        copyFirstToSecondButton.setLayoutX(13);
        copyFirstToSecondButton.setLayoutY(13);
        copyFirstToSecondButton.setPrefSize(250, 75);
        copyFirstToSecondButton.setStyle("-fx-background-color: #1a1a1a; -fx-border-color: #1a1a1a; -fx-background-radius: 10; -fx-border-radius: 10; -fx-border-width: 3; -fx-cursor: HAND; -fx-effect: dropshadow(gaussian, #000000, 20, 0, 0, 5); -fx-text-fill: WHITE;");
        rightPane1.getChildren().add(copyFirstToSecondButton);

        Pane rightPane2 = new Pane();
        rightPane2.setPrefSize(275, 100);
        Button copySecondToThirdButton = new Button("2 > 3");
        copySecondToThirdButton.setLayoutX(13);
        copySecondToThirdButton.setLayoutY(13);
        copySecondToThirdButton.setPrefSize(250, 75);
        copySecondToThirdButton.setStyle("-fx-background-color: #1a1a1a; -fx-border-color: #1a1a1a; -fx-background-radius: 10; -fx-border-radius: 10; -fx-border-width: 3; -fx-cursor: HAND; -fx-effect: dropshadow(gaussian, #000000, 20, 0, 0, 5); -fx-text-fill: WHITE;");
        rightPane2.getChildren().add(copySecondToThirdButton);

        Pane rightPane3 = new Pane();
        rightPane3.setPrefSize(275, 100);
        Button copyThirdToFirstButton = new Button("3 > 1");
        copyThirdToFirstButton.setLayoutX(13);
        copyThirdToFirstButton.setLayoutY(13);
        copyThirdToFirstButton.setPrefSize(250, 75);
        copyThirdToFirstButton.setStyle("-fx-background-color: #1a1a1a; -fx-border-color: #1a1a1a; -fx-background-radius: 10; -fx-border-radius: 10; -fx-border-width: 3; -fx-cursor: HAND; -fx-effect: dropshadow(gaussian, #000000, 20, 0, 0, 5); -fx-text-fill: WHITE;");
        rightPane3.getChildren().add(copyThirdToFirstButton);

        rightVBox.getChildren().addAll(rightPane1, rightPane2, rightPane3);

        hBox.getChildren().addAll(leftVBox, rightVBox);
        innerPane.getChildren().add(hBox);

        root.getChildren().add(innerPane);

        Scene scene = new Scene(fxmlLoader.load(), 600, 350);
        stage.setTitle("Crazy JavaFX HelloWorld");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}