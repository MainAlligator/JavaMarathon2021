package day7;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        Random random = new Random();

        int playerRandom = random.nextInt(11)+90;

        Player player = new Player(playerRandom);
        Player player1 = new Player(playerRandom);
        Player player2 = new Player(playerRandom);
        Player player3 = new Player(playerRandom);
        Player player4 = new Player(playerRandom);
        Player player5 = new Player(playerRandom);

        player1.run();

       Player.info();

        Player player6 = new Player(playerRandom);
        Player player7 = new Player(playerRandom);
        Player.info();

        for (int i =0; i < Player.MAX_STAMINA; i++) {
            player2.run();
        }
        System.out.println(Player.getCountPlayers());

        Player.info();

    }
}
