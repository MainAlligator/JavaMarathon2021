package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);

        ArrayList<Integer> numbersNew = new ArrayList<>();

        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0) {
                numbersNew.add(i);
            }

        }
        System.out.println(numbersNew);

    }
}
