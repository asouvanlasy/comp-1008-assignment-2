package com.example.weeklyschedule;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WeekTest {
    private Week week;
    private Day day;

    @BeforeEach
    void setUp() {
        week = new Week();
        day = new Day("A string", LocalDate.EPOCH);
    }

    @Test
    void addDay() {
        week.addDay(day);

        // Must compare the contents of these objects,
        // otherwise the test fails as it compares a Day with an ArrayList
        assertEquals(day, week.getDays().get(0));
    }

    @Test
    void addDayInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            // Add more than 7 days to week
            week.addDay(day);
            week.addDay(day);
            week.addDay(day);
            week.addDay(day);
            week.addDay(day);
            week.addDay(day);
            week.addDay(day);
            week.addDay(day);
        });
    }
}