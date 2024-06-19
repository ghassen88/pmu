package persistence;


import jakarta.persistence.*;

@Entity
@Table(name = "partants")
public class PartantJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int number;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseJpaEntity course;

    // Getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public CourseJpaEntity getCourse() {
        return course;
    }

    public void setCourse(CourseJpaEntity course) {
        this.course = course;
    }
}
