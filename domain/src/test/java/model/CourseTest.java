package model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    public void testCourseCreation() {
        Partant partant1 = new Partant("Horse 1", 1);
        Partant partant2 = new Partant("Horse 2", 2);
        Partant partant3 = new Partant("Horse 3", 3);
        List<Partant> partants = new ArrayList<>();
        partants.add(partant1);
        partants.add(partant2);
        partants.add(partant3);


        Course course = new Course( "Race 1",LocalDate.of(2024, 6, 14),  1, partants);

        assertEquals(LocalDate.of(2024, 6, 14), course.getDate());
        assertEquals("Race 1", course.getName());
        assertEquals(1, course.getNumber());
        assertEquals(3, course.getPartants().size());

    }

}