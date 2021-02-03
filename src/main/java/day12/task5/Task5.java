package day12.task5;



import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand ironMaiden = new MusicBand("IronMaiden", 1975, new ArrayList<>(Arrays.asList(new MusicArtist(42, "Steve Harris"),
                new MusicArtist(43, "Dave Groul"), new MusicArtist(40, "Little Franck"))));
        MusicBand theOffSpring = new MusicBand("The OffSpring", 1984, new ArrayList<>(Arrays.asList(new MusicArtist(35, " Decster Holland"),
                new MusicArtist(30, " Greg K"), new MusicArtist(29, "Peter Parad"))));

        ironMaiden.printMembers();
        theOffSpring.printMembers();

        MusicBand.transferMembers(ironMaiden, theOffSpring);

        System.out.println();

        ironMaiden.printMembers();
        theOffSpring.printMembers();

    }
}
