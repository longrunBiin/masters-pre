package week3.num3;

import week3.num3.level.BeginnerLevel;
import week3.num3.level.PlayerLevel;

public class Player {
    private static PlayerLevel level;

    public Player(PlayerLevel level) {
        Player.level = level;
    }
    public void play(int time) {
        level.go(time);
    }
    public void upgradeLevel(PlayerLevel level) {
        Player.level = level;
    }
}
