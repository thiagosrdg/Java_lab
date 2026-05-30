package base;

public abstract class AbstractCharacter implements BaseCharacter {
    protected String name;
    protected int healthPoints;
    protected int maxHP;
    protected String type;

    public AbstractCharacter(String name, int maxHP, String type) {
        this.name = name;
        this.maxHP = maxHP;
        this.healthPoints = maxHP;
        this.type = type;
    }

    @Override
    public void getDamage(int damage) {
        this.healthPoints = Math.max(0, this.healthPoints - damage);
    }

    @Override
    public boolean isAlive() {
        return this.healthPoints > 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public abstract void attack(BaseCharacter target);

    @Override
    public String toString() {
        return String.format("%s [%s] HP: %d/%d", name, type, healthPoints, maxHP);
    }
}
