package shared.dto;

import java.time.LocalDate;

public class AnimalCreationDto {
    private LocalDate date;
    private double weight;
       private String origin;

    public AnimalCreationDto(LocalDate date, double weight, String origin) {
        this.date = date;
        this.weight = weight;
        this.origin = origin;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
