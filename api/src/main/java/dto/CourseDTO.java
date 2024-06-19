package dto;

import java.util.List;

public class CourseDTO {



    private String date;
    private String name;
    private int number;
    private List<PartantDto> partants;

    // Getters and Setters


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public List<PartantDto> getPartants() {
        return partants;
    }

    public void setPartants(List<PartantDto> partants) {
        this.partants = partants;
    }
}
