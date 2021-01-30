package day11.task2;

public abstract class Hero {
    protected int health = 100;

    protected int physDef;
    protected int magicDef;

    public Hero(int physDef, int magicDef) {

        this.physDef = physDef;
        this.magicDef = magicDef;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                '}';
    }
}