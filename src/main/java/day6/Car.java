package day6;

public class Car {
    private int yearOfIssue;
    private String color;
    private String model;

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    void info(){
        System.out.println("Это автомобиль.");
    }

    public int yearDifference(int inputYear) {
        int yearCurrent = inputYear - yearOfIssue;
        return Math.max(yearCurrent, 0);

    }
}
