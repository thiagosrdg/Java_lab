package enemies.boss;

import base.AbstractEnemy;
import base.BaseCharacter;

public class Dragon extends AbstractEnemy {

    public Dragon(String name, int playerLevel) {
        super(name, 500 + (playerLevel * 200), "Boss | Dragon", 500);
    }

    @Override
    public void attack(BaseCharacter target) {
        // TODO: implementar ataque do dragão
    }

    @Override
    public String getArt() {
        return
            "  /V\\ /V\\ \n" +
            " ( @   @ ) \n" +
            " ( ~~~~~ ) \n" +
            "  \\_____/  \n" +
            "  /|   |\\  \n" +
            " /  \\ /  \\ \n";
    }

}
