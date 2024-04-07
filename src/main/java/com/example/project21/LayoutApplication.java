package com.example.project21;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LayoutApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        root.setMaxHeight(400);
        root.setMaxWidth(600);
        root.setPrefHeight(400);
        root.setPrefWidth(600);

        GridPane gridPane = new GridPane();
        gridPane.setLayoutX(8);
        gridPane.setPrefHeight(400);
        gridPane.setPrefWidth(600);

        ColumnConstraints columnConstraints1 = new ColumnConstraints();
        columnConstraints1.setHgrow(Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10);
        columnConstraints1.setPrefWidth(100);

        ColumnConstraints columnConstraints2 = new ColumnConstraints();
        columnConstraints2.setHgrow(Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10);
        columnConstraints2.setPrefWidth(100);

        RowConstraints rowConstraints1 = new RowConstraints();
        rowConstraints1.setMinHeight(10);
        rowConstraints1.setPrefHeight(30);
        rowConstraints1.setVgrow(Priority.SOMETIMES);

        RowConstraints rowConstraints2 = new RowConstraints();
        rowConstraints2.setMinHeight(10);
        rowConstraints2.setPrefHeight(30);
        rowConstraints2.setVgrow(Priority.SOMETIMES);

        RowConstraints rowConstraints3 = new RowConstraints();
        rowConstraints3.setMinHeight(10);
        rowConstraints3.setPrefHeight(30);
        rowConstraints3.setVgrow(Priority.SOMETIMES);

        gridPane.getColumnConstraints().addAll(columnConstraints1, columnConstraints2);
        gridPane.getRowConstraints().addAll(rowConstraints1, rowConstraints2, rowConstraints3);

        HBox hBox = new HBox();
        hBox.setPrefHeight(100);
        hBox.setPrefWidth(200);

        Pane pane1 = new Pane();
        pane1.setPrefHeight(134);
        pane1.setPrefWidth(100);
        pane1.setStyle("-fx-background-color: #a6c2f3;");

        Pane pane2 = new Pane();
        pane2.setPrefHeight(134);
        pane2.setPrefWidth(100);
        pane2.setStyle("-fx-background-color: #4d8dfa;");

        Pane pane3 = new Pane();
        pane3.setPrefHeight(134);
        pane3.setPrefWidth(100);
        pane3.setStyle("-fx-background-color: #256ae1;");

        hBox.getChildren().addAll(pane1, pane2, pane3);

        VBox vBox = new VBox();
        vBox.setPrefHeight(200);
        vBox.setPrefWidth(100);
        GridPane.setColumnIndex(vBox, 1);

        Pane pane4 = new Pane();
        pane4.setPrefHeight(44);
        pane4.setPrefWidth(200);
        pane4.setStyle("-fx-background-color: #a9a6e1;");
        VBox.setMargin(pane4, new Insets(0, 0, 2, 0));
        pane4.setPadding(new Insets(0, 0, 2, 0));

        Pane pane5 = new Pane();
        pane5.setPrefHeight(46);
        pane5.setPrefWidth(200);
        pane5.setStyle("-fx-background-color: #6560d9;");
        VBox.setMargin(pane5, new Insets(2, 0, 2, 0));

        Pane pane6 = new Pane();
        pane6.setPrefHeight(44);
        pane6.setPrefWidth(200);
        pane6.setStyle("-fx-background-color: #4540bb;");
        pane6.setPadding(new Insets(2, 0, 0, 0));

        vBox.getChildren().addAll(pane4, pane5, pane6);
        vBox.setPadding(new Insets(5));

        Pane pane7 = new Pane();
        pane7.setPrefHeight(200);
        pane7.setPrefWidth(200);
        pane7.setStyle("-fx-background-color: #99fa41; -fx-background-radius: 10; -fx-effect: dropshadow(gaussian, #000000, 20, 0, 0, 0);");
        GridPane.setRowIndex(pane7, 1);

        Circle circle = new Circle();
        circle.setFill(javafx.scene.paint.Color.WHITE);
        circle.setLayoutX(140);
        circle.setLayoutY(57);
        circle.setRadius(46);
        circle.setStroke(javafx.scene.paint.Color.web("#62a227"));
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle.setStrokeWidth(4);
        circle.setStyle("-fx-effect: dropshadow(gaussian, #000000, 20, 0, 0, 0);");

        pane7.getChildren().add(circle);

        VBox vBox2 = new VBox();
        vBox2.setPrefHeight(200);
        vBox2.setPrefWidth(100);
        GridPane.setColumnIndex(vBox2, 1);
        GridPane.setRowIndex(vBox2, 1);

        Pane pane8 = new Pane();
        pane8.setPrefHeight(44);
        pane8.setPrefWidth(200);

        Line line = new Line();
        line.setEndX(100);
        line.setLayoutX(150);
        line.setLayoutY(22);
        line.setStartX(-100);
        pane8.getChildren().add(line);

        Pane pane9 = new Pane();
        pane9.setPrefHeight(46);
        pane9.setPrefWidth(200);

        Text text = new Text();
        text.setLayoutX(50);
        text.setLayoutY(33);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0);
        text.setText("TARAS KHANAS");
        text.setFont(new Font("Microsoft Sans Serif", 26));
        pane9.getChildren().add(text);

        Pane pane10 = new Pane();
        pane10.setPrefHeight(44);
        pane10.setPrefWidth(200);

        Line line2 = new Line();
        line2.setEndX(100);
        line2.setLayoutX(150);
        line2.setLayoutY(22);
        line2.setStartX(-100);
        pane10.getChildren().add(line2);

        vBox2.getChildren().addAll(pane8, pane9, pane10);

        HBox hBox2 = new HBox();
        hBox2.setPrefHeight(100);
        hBox2.setPrefWidth(200);
        GridPane.setRowIndex(hBox2, 2);

        Pane pane11 = new Pane();
        pane11.setPrefHeight(133);
        pane11.setPrefWidth(100);

        Rectangle rectangle = new Rectangle();
        rectangle.setArcHeight(5);
        rectangle.setArcWidth(5);
        rectangle.setFill(javafx.scene.paint.Color.WHITE);
        rectangle.setHeight(104);
        rectangle.setLayoutX(19);
        rectangle.setLayoutY(15);
        rectangle.setStroke(javafx.scene.paint.Color.web("#1a1a1a"));
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setStrokeWidth(4);
        rectangle.setStyle("-fx-fill: linear-gradient(to bottom, red, blue); -fx-stroke-line-cap: ROUND;");
        rectangle.setWidth(62);
        pane11.getChildren().add(rectangle);

        Pane pane12 = new Pane();
        pane12.setPrefHeight(133);
        pane12.setPrefWidth(100);

        Ellipse ellipse = new Ellipse();
        ellipse.setFill(javafx.scene.paint.Color.WHITE);
        ellipse.setLayoutX(50);
        ellipse.setLayoutY(67);
        ellipse.setRadiusX(31);
        ellipse.setRadiusY(52);
        ellipse.setStroke(javafx.scene.paint.Color.web("#1a1a1a"));
        ellipse.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        ellipse.setStrokeWidth(4);
        ellipse.setStyle("-fx-stroke-line-join: ROUND;");
        pane12.getChildren().add(ellipse);

        Pane pane13 = new Pane();
        pane13.setPrefHeight(133);
        pane13.setPrefWidth(100);
        pane13.setStyle("-fx-background-color: #101090; -fx-background-radius: 10;");
        GridPane.setMargin(pane13, new Insets(10));

        Circle circle2 = new Circle();
        circle2.setFill(javafx.scene.paint.Color.web("#fffa00"));
        circle2.setLayoutX(47);
        circle2.setLayoutY(57);
        circle2.setOpacity(0.5);
        circle2.setRadius(39);
        circle2.setStroke(javafx.scene.paint.Color.BLACK);
        circle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle2.setStyle("-fx-stroke-dash-array: 4; -fx-stroke-dash-offset: 1;");
        pane13.getChildren().add(circle2);

        hBox2.getChildren().addAll(pane11, pane12, pane13);

        gridPane.getChildren().addAll(hBox, vBox, pane7, vBox2, hBox2);
        root.getChildren().addAll(gridPane);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
