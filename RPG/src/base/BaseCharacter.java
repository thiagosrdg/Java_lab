package base;

public interface BaseCharacter {

    public void attack(BaseCharacter target);
    public void getDamage(int damage);
    public boolean isAlive();
    public String getName();
    public String getType();

}
