package day14;

import java.io.File;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printSumDigits(new File("Pulling"));


    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            int count = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
                count++;
            }
            if (count == 10) {
                System.out.println("Сумма чисел: " + sum);
            } else {
                System.out.println("Не коректные данные в файле");
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Файл не найден");
        }

    }
}
