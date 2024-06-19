package model;




public class Partant {
    private Long id;
    private String name;
    private int number;
    private Course course;

    // Constructors, getters and setters

    public Partant(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // Getters and Setters


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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}