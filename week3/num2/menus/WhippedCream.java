package week3.num2.menus;

import week3.num2.beans.Coffee;

public class WhippedCream extends CoffeeMenu {
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print("Adding WhippedCream ");
    }
}
