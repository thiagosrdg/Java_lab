package enemies;

import base.AbstractEnemy;
import base.BaseCharacter;

public class Goblin extends AbstractEnemy {

    public Goblin(String name) {
        super(name, 60, "Enemy | Goblin", 30);
    }

    @Override
    public void attack(BaseCharacter target) {
        // TODO: implementar ataque do goblin
    }

    @Override
    public String getArt() {
        return
            "   ^   ^   \n" +
            "  (o . o)  \n" +
            "   \\---/  \n" +
            "   /|+|\\  \n" +
            "  / | | \\ \n";
    }

}
