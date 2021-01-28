package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 20, 30, 10),
                new Triangle("Red", 20, 15, 10),
                new Rectangle("Red", 10, 5),
                new Rectangle("Orange", 15, 40),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };

        double perimtersRed = calculateRedPerimeter(figures);
        double areaRed = calculateRedArea(figures);
        System.out.println("Сумма периметров красных фигур = " + perimtersRed);
        System.out.println("Сумма площадей красных фигур = " + areaRed);
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double perimetrs = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                perimetrs += figure.perimeter();
            }
        }
        return perimetrs;


    }

    public static double calculateRedArea(Figure[] figures) {

        double area = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                area += figure.area();
            }
        }
        return area;
    }

}

