package week3.num3;

import week3.num3.level.AdvancedLevel;
import week3.num3.level.BeginnerLevel;
import week3.num3.level.SuperLevel;

public class MainBoard {

    public static void main(String[] args) {

        Player player = new Player(new BeginnerLevel());
        player.play(1);
        player.upgradeLevel(new AdvancedLevel());
        player.play(2);
        player.upgradeLevel(new SuperLevel());
        player.play(3);

    }
}
