package day2;

import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите этажность дома:");
            int floorBuilding = scanner.nextInt();
            countFloor(floorBuilding);

        }

    public static void countFloor(int floor) {

        if (floor >= 1 && floor <= 4) {
            System.out.println("Малоэтажный дом");
        }
        else if (floor >= 5 && floor <= 8) {
            System.out.println("Среднеэтажный дом");
        }
        else if (floor >= 9) {
            System.out.println("Многоэтажный дом");
        }
        else  {
            System.out.println("Ошибка ввода");
        }

        }

}

