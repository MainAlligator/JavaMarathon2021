package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа:");

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        System.out.println(division(firstNumber,secondNumber));

    }

    public  static double division (double a, double b){
        if (b==0){
            return -1;
        }
        return a/b;

    }
}
