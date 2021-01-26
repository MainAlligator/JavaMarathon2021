package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String lesson;

    public Teacher(String name, String predmet) {
        this.name = name;
        this.lesson = predmet;
    }

    public String getName() {
        return name;
    }

    public String getLesson() {
        return lesson;
    }

    public void evaluate(Student student) {
        Random random = new Random();

        int rating = random.nextInt(3)+2;

        switch (rating){
            case 2:
                String bad = "неудовлетворительно";
                break;
            case 3:
                String satisfactorily = "удовлитварительно";
                break;
            case 4:
                String good = "хорошо";
                break;
            case 5:
                String excellent = "отлично";
                break;

        }
        System.out.println( "Преподаватель: " + getName() + "оценил студента с именем:  " + student.getName() +  "по предмету: " + getLesson()  +  "на оценку: " + rating);

    }
}
