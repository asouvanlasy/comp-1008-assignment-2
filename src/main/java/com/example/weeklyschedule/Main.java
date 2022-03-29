package com.example.weeklyschedule;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("schedule-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Weekly Schedule");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

//        Day sunday = new Day(LocalDate.now());
//        sunday.addTask("Work on Java");
//        Week week = new Week();
//        week.addDay(sunday);
//        System.out.println(sunday);
//        System.out.println(week);
    }
}