package com.example.weeklyschedule;

import java.util.ArrayList;

public class Week {
    private ArrayList<Day> days;

    public Week() {
        this.days = new ArrayList<>();
    }

    // This method takes a Day object (tasks, date) and adds it to the days list
    public void addDay(Day day) {
        days.add(day);
    }

    @Override
    public String toString() {
        return String.format("Days in week: %s", days);
    }
}
