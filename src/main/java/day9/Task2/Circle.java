package day9.Task2;

public class Circle extends Figure {

    private final double radius;
    public static final double PI = 3.14;


    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return radius * Math.pow(PI, 2);
    }
}

