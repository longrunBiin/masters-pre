package week3.num1;

public class Member {
    protected String name;
    protected int shoppingAmount;
    protected int stayHour;

    public Member(String name, int shoppingAmount, int stayHour) {
        this.name = name;
        this.shoppingAmount = shoppingAmount;
        this.stayHour = stayHour;
    }

    public int applyDiscount() {
        return shoppingAmount;
    }

    public int calculatePoint() {
        return (int) (shoppingAmount * 0.01);
    }

    public int calculateParkingFee() {
        return stayHour * 3000;
    }

    public void printResult(){
        System.out.println(name+" 님의 지불 금액은 " + applyDiscount() + " 원이고, 적립 포인트는 " + calculatePoint() + "점 입니다.");
        System.out.println("주차요금은 " + calculateParkingFee() + "원 입니다.");
    }
}
