package week2.num6;

import java.util.Random;
import week2.num6.Gamer.GamerStatus;

public class DiceGame {
    Gamer gamer;
    Random random;

    public DiceGame() {
        this.gamer = new Gamer();
        this.random = new Random();
        random.setSeed(System.currentTimeMillis());
    }

    public void play() {
        Gamer.GamerStatus status = gamer.createGamerStatus();
        for (int i = 0; i < 100; i++) {
            if (gamer.hasNoMoney()) return;
            int dice = random.nextInt(6) + 1;
            System.out.println("주사위 번호 : " + dice);

            applyDiceResult(dice);

            status = checkGamerMoney(status);
            gamer.printGamer();
        }
    }

    private void applyDiceResult(int dice) {
        switch (dice) {
            case 1, 3:
                gamer.addMoney(100);
                System.out.println("100원 추가됩니다.");
                break;
            case 2, 4:
                gamer.halfMoney();
                System.out.println("돈이 반으로 줄어듭니다.");
                break;
            case 6:
                gamer.receiveFruit();
                break;
        }
    }

    private GamerStatus checkGamerMoney(GamerStatus status) {
        if (status.lessMoneyThanMemento()) {
            status.recoveryGamer();
        }
        if (status.moreMoneyThanMemento()) {
            status = gamer.createGamerStatus();
        }
        return status;
    }
}
