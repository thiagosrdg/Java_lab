package skills;

import base.BaseCharacter;

public abstract class AbstractSkill {
    protected String name;
    protected int diceCount;
    protected int diceSides;

    public AbstractSkill(String name, int diceCount, int diceSides) {
        this.name = name;
        this.diceCount = diceCount;
        this.diceSides = diceSides;
    }

    public abstract void use(BaseCharacter user, BaseCharacter target);

    public void addDie() { diceCount++; }

    public int rollDamage() {
        // TODO: rolar diceCount dados de diceSides lados e somar
        return 0;
    }

    public String getName() { return name; }
    public int getDiceCount() { return diceCount; }
    public int getDiceSides() { return diceSides; }
}
