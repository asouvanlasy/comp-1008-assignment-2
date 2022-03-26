package com.example.weeklyschedule;

import java.time.LocalDate;
import java.util.ArrayList;

public class Day {
    private ArrayList<String> tasks;
    private LocalDate date;

    public Day(ArrayList<String> tasks) {
        tasks = new ArrayList<>();
    }
}
