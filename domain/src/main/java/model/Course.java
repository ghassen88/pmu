package model;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private Long id;
    private String name;
    private LocalDate date;
    private int number;
    private List<Partant> partants = new ArrayList<>();

    // Constructors, getters and setters


    public Course(Long id, String name, LocalDate date, int number) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.number = number;
    }

    public Course(String name, LocalDate date, int number, List<Partant> partants) {

        this.name = name;
        this.date = date;
        this.number = number;
        this.partants = partants;
    }

    public Course(String name, LocalDate date, int number) {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Partant> getPartants() {
        return partants;
    }

    public void setPartants(List<Partant> partants) {
        this.partants = partants;
    }
}