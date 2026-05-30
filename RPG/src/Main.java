import characters.Warrior;
import characters.Archer;
import characters.Mage;
import enemies.Goblin;
import enemies.Dragon;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Arthur");
        Archer archer = new Archer("Legolas");
        Mage mage = new Mage("Gandalf");

        Goblin goblin = new Goblin("Grak");
        Dragon dragon = new Dragon("Placidusax");

        System.out.println(warrior);
        System.out.println(archer);
        System.out.println(mage);
        System.out.println(goblin);
        System.out.println(dragon);

        // Exemplo de combate (descomente quando implementar attack):
        // warrior.attack(goblin);
        // System.out.println(goblin);
    }
}
