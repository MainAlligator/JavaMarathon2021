package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        double x = scanner.nextDouble();

        if (x >= 5) {
            double y;
            y = (Math.pow(x, 2) - 10) / (100 + 7);
            System.out.println("y = " + y);
        } else if (x > -3 && x < 5) {
            double y;
            y = (x + 3) * (Math.pow(x, 2) - 2);
            System.out.println("y = " + y);
        } else {
            double y = 420;
            System.out.println("y = " + y);
        }

    }
}
