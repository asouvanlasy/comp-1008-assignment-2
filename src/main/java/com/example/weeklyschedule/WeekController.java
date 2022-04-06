package com.example.weeklyschedule;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;


public class WeekController {
    @FXML
    DatePicker datePicker = new DatePicker();

    @FXML
    TextField taskField = new TextField();

    @FXML
    Button submitDayBtn = new Button();

    @FXML
    Button removeBtn = new Button();

    @FXML
    ListView weekView = new ListView();

    // TODO
    // screw the Week class for now
    // just be able to create new days and show them in a list

    @FXML
    public void initialize() {
        Week week = new Week();

        // Add day to week and list
        submitDayBtn.setOnAction(e -> {
            // In order to create multiple day objects, I need to create it here
            Day day = new Day("Your task", LocalDate.EPOCH);

            // Set the date
            long epochDate = datePicker.getValue().toEpochDay();
            LocalDate localDate = LocalDate.ofEpochDay(epochDate);
            day.setDate(localDate);

            // Set the task
            String task = taskField.getText();
            day.setTask(task);

            // Add the day
            week.addDay(day);

            // Add all days to the listView
            weekView.getItems().setAll(week.getDays());
        });

        // Remove day from week and list
        removeBtn.setOnAction(e -> {
            int selectedDay = weekView.getSelectionModel().getSelectedIndex();
            week.getDays().remove(selectedDay);
            weekView.getItems().remove(selectedDay);
        });
    }
}