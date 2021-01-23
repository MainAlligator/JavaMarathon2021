package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите делимое: ");
            double firstNumber= scan.nextDouble();
            System.out.print("Введите делитель: ");
            double secondNumber = scan.nextDouble();

            if (secondNumber == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            double result = firstNumber/secondNumber;
            System.out.println("Результат деления: " + result);
        }

    }
}
