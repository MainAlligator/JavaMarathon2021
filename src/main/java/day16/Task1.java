package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/test/resources/D16T1_1.txt");

        printResult(file);

    }

    public static void printResult(File file) {

        Scanner scanner;

        {
            try {
                scanner = new Scanner(file);
                double sum = 0;
                int count = 0;

                while (scanner.hasNextInt()) {

                    int number = scanner.nextInt();
                    sum += number;
                    count++;
                }
                scanner.close();

                double average = sum / count;
                System.out.println("Среднее число из файла: " + average);
                System.out.printf("%.3f", average);


            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден!");
            }
        }
    }
}

