package com.example.weeklyschedule;

import java.time.LocalDate;
import java.util.ArrayList;

public class Day {
    private ArrayList<String> tasks;
    private LocalDate date;

    public Day(LocalDate date) {
        this.tasks = new ArrayList<>();
        this.date = date;
    }

    // Method to add strings to the tasks list
    // An exception is thrown if the field is empty
    public void addTask(String task) {
        if (!task.isEmpty()) {
            tasks.add(task);
        } else {
            throw new IllegalArgumentException("Task cannot be empty.");
        }
    }

    @Override
    public String toString() {
        return String.format("Date: %s Tasks: %s", date, tasks);
    }
}
