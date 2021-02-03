package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        MusicBand radioHead = new MusicBand("Radiohead", 1985, new ArrayList<>(Arrays.asList("Tom York",
                "Jhonny Greenwood", "Colina Greenwood", "Fila Selvia", "Eda O'brayen")));
        MusicBand oasis = new MusicBand("Oasis", 1991, new ArrayList<>(Arrays.asList("Liam Gallagher",
                "Paul McGuigan", "Tonny MacCarrol", "Paul Arthurs")));

        radioHead.printMembers();
        oasis.printMembers();

        MusicBand.transferMembers(radioHead, oasis);

        System.out.println();

        radioHead.printMembers();
        oasis.printMembers();


    }
}
