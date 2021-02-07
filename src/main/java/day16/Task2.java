package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text1.txt");
        File file1 = new File("Text2.txt");

        createrListAverage(file, file1);

    }

    public static void createrListAverage(File file1, File file2) throws FileNotFoundException {

        Random random = new Random();
        PrintWriter pw = new PrintWriter(file1);

        for (int i = 0; i < 1000; i++)
            pw.println(random.nextInt(100));
        pw.close();

        Scanner scanner = new Scanner(file1);

        PrintWriter pw1 = new PrintWriter(file2);

        int counter = 0;
        int sum = 0;

        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());

            counter++;

            if (counter == 20) {
                pw1.println(sum / 20.0);

                counter = 0;
                sum = 0;
            }
        }
        pw1.close();

        try (Scanner scanner1 = new Scanner(file2)) {
            double summ = 0;
            while (scanner1.hasNext()) {
                sum += scanner1.nextDouble();
            }
            int sumInt = (int) summ;
            System.out.println(sumInt);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не создан");

        }
    }
}

