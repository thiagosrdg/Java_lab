package base;

public abstract class AbstractEnemy extends AbstractCharacter {
    protected int xpReward;

    public AbstractEnemy(String name, int maxHP, String type, int xpReward) {
        super(name, maxHP, type);
        this.xpReward = xpReward;
    }

    public int getXpReward() { return xpReward; }
}
