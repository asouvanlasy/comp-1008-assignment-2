package com.example.weeklyschedule;

import java.util.ArrayList;

public class Week {

    private ArrayList<Day> days;

    public Week() {
        this.days = new ArrayList<Day>();
    }

    /**
     * This method takes a Day object (tasks, date) and adds it to the days list
     * @param day - An exception is thrown if you try to add more than 7 days
     */
    public void addDay(Day day) {
        if (days.size() < 7) {
            days.add(day);
        } else {
            throw new IllegalArgumentException("Maximum days in a week (7) reached.");
        }
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    @Override
    public String toString() {
        return days.toString();
    }
}