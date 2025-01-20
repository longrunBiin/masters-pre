package week3.num2.menus;

import week3.num2.beans.Coffee;

public abstract class CoffeeMenu implements Coffee {
    Coffee coffee;

    public CoffeeMenu(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
