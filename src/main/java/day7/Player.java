package day7;

public class Player {

    private int stamina;

    static final int  MAX_STAMINA =100;
    static final int MIN_STAMINA =0;

    static   int countPlayers;




    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6 && countPlayers >= 0) {
            countPlayers++;
        }
    }


    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        if (stamina == 0)
            return;

        stamina--;

        if(stamina == 0) {
            countPlayers--;
        }
    }

    public static void info(){
        int diferencePlayers = 6 - countPlayers;
        if(countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть" + diferencePlayers + "свободных мест");
        } else if (countPlayers==6) {
            System.out.println("Команды укомплектованны");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }


}
