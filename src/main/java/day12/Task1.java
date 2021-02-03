package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> car = new ArrayList<>();

        car.add("BMW");
        car.add("Volvo");
        car.add("Suzuki");
        car.add("Hyundai");
        car.add("Mitsubishi");
        System.out.println(car);

        car.add(3, "Ferrari");
        car.remove(2);
        System.out.println(car);

    }
}






