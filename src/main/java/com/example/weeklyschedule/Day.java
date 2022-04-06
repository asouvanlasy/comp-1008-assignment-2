package com.example.weeklyschedule;

import java.time.LocalDate;

public class Day {
    private String task;
    private LocalDate date;

    public Day(String task, LocalDate date) {
        setTask(task);
        setDate(date);
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        if (task.length() > 1 && !task.isBlank()) {
            this.task = task;
        } else {
            throw new IllegalArgumentException("Task must be at least 2 characters.");
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("\nDate: %s\nTasks: %s", date, task);
    }
}
