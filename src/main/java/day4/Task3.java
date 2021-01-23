package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] myArray = new int[12][8];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = random.nextInt(50);

            }
        }

        int totalIndex = 0;
        int max = 0;
        int index = 0;


        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                totalIndex += myArray[i][j];
            }
            if (totalIndex >= max) {
                index = i;
                max = totalIndex;


            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + index);


    }
}
