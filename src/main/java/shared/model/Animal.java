package shared.model;

import java.time.LocalDate;

public class Animal {

    private LocalDate date;
    private double weight;
    private int regNum;
    private String origin;

    public Animal(LocalDate date, double weight, int regNum, String origin) {
        this.date = date;
        this.weight = weight;
        this.regNum = regNum;
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

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
