package day8;

public class Task1 {
    public static void main(String[] args) {
        long start;
        long finish;
        long timeConsumedMillis;
        long start1;
        long finish1;
        long timeConsumedMillis1;
        String string  =" ";


        start = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            string  = i+ " ";

        }
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;

        System.out.println(string);

        start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 20000; j++) {
            sb.append(j);

            sb.append(" ");
        }
        finish1 = System.nanoTime();
        timeConsumedMillis1 = finish1 - start1;

        System.out.println(sb.toString());

        System.out.println("Время первого метода: " + timeConsumedMillis);
        System.out.println("Время второго метода: " + timeConsumedMillis1);
    }

}

