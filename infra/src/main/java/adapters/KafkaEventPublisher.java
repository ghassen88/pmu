package adapters;


import io.smallrye.reactive.messaging.kafka.KafkaRecord;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.Course;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import ports.EventPublisher;

@ApplicationScoped
public class KafkaEventPublisher implements EventPublisher {
    @Inject
    @Channel("course-created")
    Emitter<Course> emitter;


    @Override
    public void publishCourseCreatedEvent(Course course) {
        emitter.send(KafkaRecord.of("course-created-key", course));

    }
}
