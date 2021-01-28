package day9.Task2;

public class Rectangle extends Figure {

    private int weight;
    private int leight;

    public Rectangle(String color, int weight, int leight) {
        super(color);
        this.weight = weight;
        this.leight = leight;
    }

    @Override
    public double area() {
        return weight * leight;
    }

    @Override
    public double perimeter() {
        return 2 * weight + 2 * leight;
    }
}
