package day7;

public class Airplane {
    private String model;
    private String producer;
    private int year;
    private int length;
    private int weight;
    private double fuel = 0;

    public Airplane(String producer, int year, int length, int weight, String model) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.model = model;
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

    public void setModel(String model) {
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

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {

        if (airplane1.length < airplane2.length) {
            System.out.println("Длинее самолет: " + airplane2.model);
        } else if (airplane1.length == airplane2.length) {
            System.out.println("Они равны. ");
        } else {
            System.out.println("Длинее самолет: " + airplane1.model);
        }

    }
}
