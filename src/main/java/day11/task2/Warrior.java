package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    private int physAtt = 30;

    public Warrior() {
        super(80, 0);
    }

    @Override
    public void physicalAttack(Hero hero) {
        int attack = (physAtt * (100 - hero.physDef)) / 100;
        if (hero.health - physAtt < 0) {
            hero.health = 0;
        } else {
            hero.health -= attack;
        }


    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
