package bossmonster.domain;

public class GameCharacters {
    private final Monster monster;
    private final Player player;

    public GameCharacters(Monster monster, Player player) {
        this.monster = monster;
        this.player = player;
    }

    public static GameCharacters of(Monster monster, Player player) {
        return new GameCharacters(monster, player);
    }

    public Monster getMonster() {
        return monster;
    }

    public Player getPlayer() {
        return player;
    }

    public void applyAttack(PlayerAttack playerAttack, Hp monsterAttack) {
        player.damagedBy(monsterAttack);
        player.affectMpBy(playerAttack);
        monster.damagedBy(playerAttack);
    }
}
