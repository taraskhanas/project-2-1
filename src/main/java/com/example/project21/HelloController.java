package com.example.project21;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button copyFirstToSecondButton;

    @FXML
    private Button copySecondToThirdButton;

    @FXML
    private Button copyThirdToFirstButton;

    @FXML
    private TextField firstField;

    @FXML
    private TextField secondField;

    @FXML
    private TextField thirdField;

    @FXML
    void initialize() {
        copyFirstToSecondButton.setOnAction(event -> {
            secondField.setText(firstField.getText());
        });
        copySecondToThirdButton.setOnAction(event -> {
            thirdField.setText(secondField.getText());
        });
        copyThirdToFirstButton.setOnAction(event -> {
            firstField.setText(thirdField.getText());
        });
    }

}
