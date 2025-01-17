package week2.num4;

public class HyundaiFactory {
    private static int carNumber = 1000;

    private HyundaiFactory(){}

    private static class FactoryHolder{
        private static final HyundaiFactory INSTANCE = new HyundaiFactory();
    }
    public static HyundaiFactory getFactory() {
        return FactoryHolder.INSTANCE;
    }

    public Car createCar() {
        return new Car(carNumber++);
    }
}
