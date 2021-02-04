package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File readerFile = new File("shoes.csv");
        File writerFile = new File("missing_shoes.txt");
        convertionFile(readerFile,writerFile);


    }

    public static void convertionFile(File input , File output) {

        List<String> value = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(input);

            PrintWriter pw = new PrintWriter(output);
            while (scanner.hasNextLine()){

                String[] number = scanner.nextLine().split(";");
                if (Integer.parseInt(number[2]) ==0){
                   value.add(number[0] + ", "+ number [1] + " , " + number[2]);
                   pw.println(value);


                }
            }

            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}
