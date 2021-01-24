package day5;

public class Task1 {
    public static void main(String[] args) {

        Car carHundai = new Car();
        carHundai.setYearOfIssue(2020);
        carHundai.setColor("White");
        carHundai.setModel("Elantra");

        System.out.println(carHundai.getYearOfIssue());
        System.out.println(carHundai.getColor());
        System.out.println(carHundai.getModel());

    }
}
