package day6;

public class Task2 {
    public static void main(String[] args) {
       Airplane boeingMAX = new Airplane("Boeing", 2000,300,25000);

       boeingMAX.setYear(2010);
       boeingMAX.setLength(350);

       boeingMAX.fillUp(50);
       boeingMAX.fillUp(100);

       boeingMAX.info();
    }
}
