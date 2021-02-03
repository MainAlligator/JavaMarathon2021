package day12.task3;

import javax.swing.event.ListDataEvent;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
         ByteArrayInputStream testIn;

        List<MusicBand> musicBands = new ArrayList<>();

        musicBands.add(new MusicBand(" Hadorbanim", 1999));
        musicBands.add(new MusicBand(" Zino & Tommy", 2010));
        musicBands.add(new MusicBand(" The High Windows", 1969));
        musicBands.add(new MusicBand(" Hakol Over Habibi", 1975));
        musicBands.add(new MusicBand(" Ido B Zooki", 2016));
        musicBands.add(new MusicBand(" Marbin", 2015));
        musicBands.add(new MusicBand(" Rendezvous", 2013));
        musicBands.add(new MusicBand(" Lucille", 2014));
        musicBands.add(new MusicBand(" Acollective ", 2008));
        musicBands.add(new MusicBand(" Milk and Honey ", 1979));

        Collections.shuffle(musicBands);

        System.out.println("Все музыкальные группы: ");
        System.out.println(musicBands);

        System.out.println("Музыкальные группы после 2000 года: ");
        System.out.println(groupsAfter2000(musicBands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {

        List<MusicBand> musicBandsAfter = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                musicBandsAfter.add(band);
            }

        }


        return musicBandsAfter;
    }
}
