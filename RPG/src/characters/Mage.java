package characters;

import base.AbstractCharacter;
import base.BaseCharacter;

public class Mage extends AbstractCharacter {

    public Mage(String name) {
        super(name, 80, "Mage");
    }

    @Override
    public void attack(BaseCharacter target) {
        // TODO: implementar ataque do mago
    }

    @Override
    public String getArt() {
        return
            "  + * * +  \n" +
            "    (O)    \n" +
            "    \\|/   \n" +
            "     |     \n" +
            "    /^\\   \n";
    }

}
