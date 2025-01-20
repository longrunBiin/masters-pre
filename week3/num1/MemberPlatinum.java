package week3.num1;

public class MemberPlatinum extends Member{
    public MemberPlatinum(String name, int shoppingAmount, int stayHour) {
        super(name, shoppingAmount, stayHour);
    }

    @Override
    public int applyDiscount() {
        return (int) (shoppingAmount - shoppingAmount * 0.05);
    }

    @Override
    public int calculatePoint() {
        return (int) (shoppingAmount * 0.05);
    }

    @Override
    public int calculateParkingFee() {
        return stayHour * 1000;
    }
}
