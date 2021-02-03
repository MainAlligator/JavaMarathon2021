package day12.task5;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List <MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        musicBand2.members.addAll(musicBand1.members);
        musicBand1.members.clear();
    }

    public void printMembers() {
        System.out.println(members);
    }
}

