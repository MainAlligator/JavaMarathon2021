package day6;

public class Task1 {
    public static void main(String[] args) {

        Motorbike yamaha = new Motorbike(2010,"Red","YT-20");

        yamaha.info();
        System.out.println(yamaha.yearDifference(2020));
        System.out.println(yamaha.yearDifference(2000));

        Car mitsubishi = new Car();
        mitsubishi.setYearOfIssue(2010);

        mitsubishi.info();
        System.out.println(mitsubishi.yearDifference(2020));
        System.out.println(mitsubishi.yearDifference(2000));


    }
}
