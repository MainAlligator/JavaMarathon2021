package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();


        int[] myArrays = new int[100];

        for (int i = 0; i < myArrays.length; i++) {
            myArrays[i] = random.nextInt(10000);
        }

        int indexMax = 0;
        int indexMin=0;
        int indexNull = 0;
        int totalNull = 0;

        for (int i : myArrays) {
            if (i < indexMin) {
                i = indexMin;
            } else if (i > indexMax) {
                indexMax = i;
            } else if (i % 10 == 0) {
                indexNull++;
                totalNull += i;
            }

        }
        System.out.println("Информация о массиве:");
        System.out.println("Наименьший элемент массива: " + indexMin);
        System.out.println("Наибольший элемент массива: " + indexMax);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + indexNull);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + totalNull);


    }
}
