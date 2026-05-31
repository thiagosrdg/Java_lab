package base;

import equipment.EquipmentSet;
import skills.AbstractSkill;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCharacter implements BaseCharacter {
    protected String name;
    protected int healthPoints;
    protected int maxHP;
    protected String type;
    protected List<AbstractSkill> skills = new ArrayList<>();
    protected EquipmentSet equippedSet;
    protected int level = 1;
    protected int xp = 0;

    public AbstractCharacter(String name, int maxHP, String type) {
        this.name = name;
        this.maxHP = maxHP;
        this.healthPoints = maxHP;
        this.type = type;
    }

    public void gainXp(int amount) {
        // TODO: somar xp, chamar levelUp() a cada 100 xp acumulado
    }

    public void levelUp() {
        // TODO: level++, maxHP += 10, healthPoints += 10, skill.addDie() em cada skill
    }

    public void fullHeal() {
        this.healthPoints = this.maxHP;
    }

    public int getLevel() {
        return this.level;
    }

    @Override
    public abstract void attack(BaseCharacter target);

    public abstract String getArt();

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
    public String toString() {
        return String.format("%s [%s] HP: %d/%d", name, type, healthPoints, maxHP);
    }
}
