package week3.num1;

public class MemberDiamond extends Member{
    public MemberDiamond(String name, int shoppingAmount, int stayHour) {
        super(name, shoppingAmount, stayHour);
    }

    @Override
    public int applyDiscount() {
        return (int) (shoppingAmount - shoppingAmount * 0.1);
    }

    @Override
    public int calculatePoint() {
        return (int) (shoppingAmount * 0.1);
    }

    @Override
    public int calculateParkingFee() {
        return 0;
    }
}
