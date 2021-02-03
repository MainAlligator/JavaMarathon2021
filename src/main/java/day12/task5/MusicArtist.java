package day12.task5;

public class MusicArtist {
private int age;
private String name;

    public MusicArtist(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
