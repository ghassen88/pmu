package service;



import io.quarkus.test.junit.QuarkusTest;
import model.Course;
import model.Partant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ports.CourseRepository;
import ports.EventPublisher;


import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.util.List;


@QuarkusTest
public class CourseServiceTest {


    private CourseRepository courseRepository;
    private EventPublisher eventPublisher;
    private CourseService courseService;

    @BeforeEach
    public void setUp() {
        courseRepository = mock(CourseRepository.class);
        eventPublisher = mock(EventPublisher.class);
        courseService = new CourseService(courseRepository, eventPublisher);
    }

    @Test
    public void testCreateCourse() {
        Partant partant1 = new Partant("Horse 1", 1);
        Partant partant2 = new Partant("Horse 2", 2);
        Partant partant3 = new Partant("Horse 3", 3);
        List<Partant> partants = List.of(partant1, partant2, partant3);

        Course course = new Course( "Race 1",LocalDate.of(2024, 6, 14),  1, partants);

        courseService.createCourse(course);

        verify(courseRepository, times(1)).save(course);
        verify(eventPublisher, times(1)).publishCourseCreatedEvent(course);
    }
}