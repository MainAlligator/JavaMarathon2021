package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("People.txt");

        System.out.println(parseFileToObjList(file));

    }

    public static List<Human> parseFileToObjList(File file) {

        List<Human> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                String[] person = line.split(" ");

                int age = Integer.parseInt(person[1]);

                if (age < 0)
                    throw new IllegalArgumentException();

                Human currentHuman = new Human(person[0], age);

                people.add(currentHuman);


            }
            return people;

        } catch (FileNotFoundException e) {
            System.out.println("“Файл не найден”");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");

        }


        return null;
    }


}

