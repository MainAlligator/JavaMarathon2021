package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] myArray = new int[100];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10000);

        }
        int trioIndex = -1;
        int trioMaxSum = 0;
        for (int i = 0; i < myArray.length - 2; i++) {
            int currentSum = myArray[i] + myArray[i + 1] + myArray[i + 2];
            if (currentSum > trioMaxSum) {
                trioMaxSum = currentSum;
                trioIndex = i;


            }
        }
        System.out.println(trioMaxSum);
        System.out.println(trioIndex);

    }
}
