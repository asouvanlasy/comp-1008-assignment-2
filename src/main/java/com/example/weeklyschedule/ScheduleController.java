package com.example.weeklyschedule;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.Date;

public class ScheduleController {
    @FXML
    DatePicker datePicker = new DatePicker();

    @FXML
    TextField taskField = new TextField();

    @FXML
    Button submitDayBtn = new Button();

    @FXML
    Label testLabel = new Label();

    @FXML
    public void initialize() {

        Day sunday = new Day("Sunday", LocalDate.of(2022,4,3));

        Week week = new Week();
        week.addDay(sunday);
        testLabel.setText("BBBBB");


        submitDayBtn.setOnAction(e -> {
            Date date = new Date(datePicker.getValue().toEpochDay());
            testLabel.setText("AAAAA");
        });


    }
}