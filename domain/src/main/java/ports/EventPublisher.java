package ports;


import model.Course;

public interface EventPublisher {
    void publishCourseCreatedEvent(Course course);
}
