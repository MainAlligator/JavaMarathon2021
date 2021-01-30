package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {

    private int healHimself = 25;
    private int healTeammate = 10;
    private int physAtt = 15;

    public Paladin() {
        super(50, 20);
    }

    @Override
    public void healHimself() {
        if (health + healHimself > 100) {
            health = 100;
        } else {

            health += healHimself;

        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (health + healTeammate > 100) {
            health = 100;
        } else {

            health += healTeammate;

        }

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
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}


