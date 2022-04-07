import com.example.weeklyschedule.Day;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {
    private Day day;

    @BeforeEach
    void setUp() {
        day = new Day("Your task", LocalDate.EPOCH);
    }

    @Test
    void setTask() {
        day.setTask("A string");
        assertEquals("A string", day.getTask());
    }

    @Test
    void setTaskInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            day.setTask("");
        });
    }

    @Test
    void setDate() {
        day.setDate(LocalDate.EPOCH);
        assertEquals(LocalDate.EPOCH, day.getDate());
    }
}