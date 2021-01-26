package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private double fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void info() {
        System.out.print(
                "Изготовитель:  " + producer +
                        "\nгод выпуска: " + year +
                        "\nдлина:   " + length +
                        "\nвес:  " + weight +
                        "\nколичество топлива в баке:  " + fuel);
    }


    public void fillUp(int n) {
        fuel += n;

    }
}
