package com.example.weeklyschedule;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ScheduleController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}