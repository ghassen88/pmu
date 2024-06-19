package service;


import model.Course;
import ports.CourseRepository;
import ports.EventPublisher;

public class CourseService {

    private final CourseRepository courseRepository;
    private final EventPublisher eventPublisher;

    public CourseService(CourseRepository courseRepository, EventPublisher eventPublisher) {
        this.courseRepository = courseRepository;
        this.eventPublisher = eventPublisher;
    }

    public void createCourse(Course course) {
        courseRepository.save(course);
        eventPublisher.publishCourseCreatedEvent(course);
    }
}

