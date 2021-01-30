package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    private int physAtt = 5;
    private int magicAtt = 20;

    public Magician() {
        super(0, 80);
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
    public void magicalAttack(Hero hero) {
        int attackMagic = (magicAtt * (100 - hero.magicDef)) / 100;
        if (hero.health - physAtt < 0) {
            hero.health = 0;
        } else {
            hero.health -= attackMagic;
        }

    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}

