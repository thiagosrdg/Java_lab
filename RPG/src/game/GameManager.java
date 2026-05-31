package game;

import base.AbstractCharacter;
import base.AbstractEnemy;
import combat.Combat;
import java.util.List;
import java.util.Random;

public class GameManager {
    private AbstractCharacter player;
    private List<AbstractEnemy> enemyPool;
    private List<AbstractEnemy> bossPool;
    private int combatCount = 0;
    private Random random = new Random();

    public GameManager(AbstractCharacter player, List<AbstractEnemy> enemyPool, List<AbstractEnemy> bossPool) {
        this.player = player;
        this.enemyPool = enemyPool;
        this.bossPool = bossPool;
    }

    public void run() {
        while (player.isAlive()) {
            AbstractEnemy enemy = nextEnemy();

            Combat combat = new Combat(player, enemy);
            combat.start();

            if (!player.isAlive()) {
                gameOver();
                return;
            }

            onCombatEnd(enemy);
        }
    }

    private AbstractEnemy nextEnemy() {
        // luta 5, 11, 17... (a cada 6 combates) é boss
        if (combatCount % 6 == 5) {
            // TODO: criar boss fresh com player.getLevel() para escalar o HP
            // ex: new Dragon("nome", player.getLevel())
        }
        // TODO: retornar enemyPool.get(random.nextInt(enemyPool.size()))
        return null;
    }

    private void autoHeal() {
        player.fullHeal();
    }

    private void onCombatEnd(AbstractEnemy defeated) {
        player.gainXp(defeated.getXpReward());
        autoHeal();
        combatCount++;
    }

    private void gameOver() {
        // TODO: exibir mensagem de game over e estatísticas finais
    }
}
