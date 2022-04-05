package com.example.weeklyschedule;

import java.time.LocalDate;

public class Day {
    private String task;
    private LocalDate date;

    public Day(String task, LocalDate date) {
        setTask(task);
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        if (task.length() > 1) {
            this.task = task;
        } else {
            throw new IllegalArgumentException("Task must be at least 2 characters.");
        }
    }

    @Override
    public String toString() {
        return String.format("Date: %s Tasks: %s", date, task);
    }
}
