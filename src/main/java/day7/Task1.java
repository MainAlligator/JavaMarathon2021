package day7;

public class Task1 {
    public static void main(String[] args) {


        Airplane airplane = new Airplane("Boeing", 2010,250,1000,"Boeing 737");

        Airplane airplane1 = new Airplane("Boeing", 2020,300,450, "Boeing MAX");


        Airplane.compareAirplanes(airplane,airplane1);

    }
}