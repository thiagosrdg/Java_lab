package combat;

import base.AbstractCharacter;

public class Combat {
    private AbstractCharacter player;
    private AbstractCharacter enemy;
    private boolean healUsed = false;

    public Combat(AbstractCharacter player, AbstractCharacter enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void start() {
        // TODO: loop de turnos enquanto ambos estiverem vivos
    }

    private void playerTurn() {
        // TODO: exibir opções (1/2/3 = skill, 4 = cura 50%)
        // TODO: ler input do jogador
        // TODO: se escolheu 4 e healUsed == true, avisar que já usou e pedir nova escolha
        // TODO: executar ação escolhida
    }

    private void enemyTurn() {
        // TODO: lógica de ataque do inimigo
    }

    private void heal() {
        // TODO: restaurar 50% do maxHP do player
        // TODO: healUsed = true
    }
}
