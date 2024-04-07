package com.example.project21;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
//adaw
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}