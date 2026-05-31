package equipment;

public abstract class EquipmentSet {
    protected String name;
    protected int hpBonus;
    protected int skillBoosted; // qual skill recebe o bonus (1, 2 ou 3)
    protected int damageBonus;

    public EquipmentSet(String name, int hpBonus, int skillBoosted, int damageBonus) {
        this.name = name;
        this.hpBonus = hpBonus;
        this.skillBoosted = skillBoosted;
        this.damageBonus = damageBonus;
    }

    public String getName() { return name; }
    public int getHpBonus() { return hpBonus; }
    public int getSkillBoosted() { return skillBoosted; }
    public int getDamageBonus() { return damageBonus; }
}
