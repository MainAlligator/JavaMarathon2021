package day14;

public class Human {

    private int age;
    private String name;

    public Human(String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
