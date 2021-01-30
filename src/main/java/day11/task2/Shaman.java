package day11.task2;

public class Shaman extends Hero implements Healer,PhysAttack,MagicAttack{

    private int healHimself = 50;
    private int healTeammate = 30;
    private int physAtt = 10;
    private int magicAtt = 15;

    public Shaman() {
        super(20,20);
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
        if (hero.health + healTeammate > 100) {
            hero.health = 100;
        } else {

            health += healTeammate;

        }

    }

    @Override
    public void physicalAttack(Hero hero) {
        int attack = (physAtt*(100 -hero.physDef))/100;
        if(hero.health -physAtt <0){
            hero.health =0;
        } else {
            hero.health -=attack;
        }

    }

    @Override
    public void magicalAttack(Hero hero) {
        int attackMagic = (magicAtt*(100 -hero.magicDef))/100;
        if(hero.health -physAtt <0){
            hero.health =0;
        } else {
            hero.health -=attackMagic;
        }

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
