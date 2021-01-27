package day8;

public class Task1 {
    public static void main(String[] args) {
        long start;
        long finish;
        long timeConsumedMillis = 0;
        long start1;
        long finish1;
        long timeConsumedMillis1 = 0;


        for (int i = 0; i <= 20000; i++) {

            start = System.nanoTime();

            System.out.println(i + " ");
            finish = System.nanoTime();
            timeConsumedMillis = finish - start;
        }

        for (int j = 0; j < 20000; j++) {


            StringBuilder sb = new StringBuilder();
            start1 = System.nanoTime();
            sb.append(j);

            sb.append(" ");
            System.out.println(sb.toString());
            finish1 = System.nanoTime();
            timeConsumedMillis1 = finish1 - start1;
        }

        System.out.println("Время первого метода: " + timeConsumedMillis);
        System.out.println("Время второго метода: " + timeConsumedMillis1);
    }

}

