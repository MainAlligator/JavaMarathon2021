package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scan.nextInt();
        int[] myArrays = new int[size];

        for (int i = 0; i < myArrays.length; i++) {
            myArrays[i] = random.nextInt(10);
        }

        int numberMore8 = 0;
        int numberOne = 0;
        int paraCount = 0;
        int noParaCount = 0;
        int sum = 0;


        for (int number : myArrays) {
            if (number > 8) numberMore8++;
            else if (number == 1) numberOne++;
            if (number % 2 == 0) paraCount++;
            else noParaCount++;
            sum += number;

        }

        System.out.println(Arrays.toString(myArrays));
        System.out.println("Информация о массиве: ");
        System.out.println("Длина массива: " + myArrays.length);
        System.out.println("Количество чисел больше 8: " + numberMore8);
        System.out.println("Количество чисел равных 1: " + numberOne);
        System.out.println("Количество четных чисел: " + paraCount);
        System.out.println("Количество нечетных чисел: " + noParaCount);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}


