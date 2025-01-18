package week2.num6;

public class Gamer {
    private int money;
    private int apple;
    private int shineMuscat;
    private int orange;
    private int fruitSequence;

    public Gamer() {
        this.money = 1000;
        this.apple = 0;
        this.shineMuscat = 0;
        this.orange = 0;
        fruitSequence = 0;
    }


    public void addMoney(int money) {
        this.money += money;
    }

    public void halfMoney() {
        this.money /= 2;
    }

    public void receiveFruit() {
        switch (fruitSequence){
            case 0 : apple++;
                System.out.println("사과를 얻었습니다.");break;
            case 1 : shineMuscat++;
                System.out.println("샤인머스캣을 얻었습니다.");break;
            case 2 : orange++;
                System.out.println("귤을 얻었습니다.");break;
        }
        fruitSequence = (fruitSequence + 1) % 3;
    }

    public boolean hasNoMoney() {
        return money == 0;
    }



    //Memento
    //내부 클래스로 선언하고 외부에서 상태 저장이 가능하도록 public 선언
    public class GamerStatus{
        private int moneySnapshot;
        private int appleCount;
        private int shineMuscatCount;
        private int orangeCount;

        //스냅샷 생성은
        private GamerStatus(Gamer gamer) {
            this.moneySnapshot = gamer.money;
            this.appleCount = gamer.apple;
            this.shineMuscatCount = gamer.shineMuscat;
            this.orangeCount = gamer.orange;
        }

        //외부에서 상태 회복 가능
        public void recoveryGamer() {
            money = moneySnapshot;
            apple = appleCount;
            shineMuscat = shineMuscatCount;
            orange = orangeCount;
            System.out.println("상태를 회복했습니다.");
        }
        public boolean lessMoneyThanMemento() {
            return money < moneySnapshot / 2;
        }

        public boolean moreMoneyThanMemento() {
            return money > moneySnapshot;
        }
    }
    public GamerStatus createGamerStatus() {
        return new GamerStatus(this);
    }

    public void printGamer() {
        System.out.println("남은 돈 : " + money + "원");
        System.out.println("사과 : " + apple);
        System.out.println("샤인머스캣 : " + shineMuscat);
        System.out.println("귤 : " + orange);
        System.out.println("-------------------------------------------------");
    }
}
