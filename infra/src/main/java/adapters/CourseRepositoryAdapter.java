package adapters;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.Course;
import persistence.CourseJpaEntity;
import ports.CourseRepository;
import repositories.CourseJpaRepository;

import java.util.Optional;

@ApplicationScoped
public class CourseRepositoryAdapter implements CourseRepository {

    @Inject
    CourseJpaRepository courseJpaRepository;

    @Override
    public Course save(Course course) {
        CourseJpaEntity courseJpaEntity = new CourseJpaEntity();

        courseJpaRepository.persist(courseJpaEntity);
        return course;
    }

    @Override
    public Optional<Course> findById(Long id) {
        CourseJpaEntity entity = courseJpaRepository.findById(id);
        return Optional.ofNullable(entity != null ? new Course(entity.getName(), entity.getDate(), entity.getNumber()) : null);
    }
}