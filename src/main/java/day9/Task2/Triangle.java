package day9.Task2;

public class Triangle extends Figure {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, int side1, int side2, int side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public double area() {

        double poluPerimetr = (side1 + side2 + side3) / 2;
        return Math.sqrt(poluPerimetr * (poluPerimetr - side1) * (poluPerimetr * side2) * (poluPerimetr * side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
