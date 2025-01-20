package week3.num2;

import week3.num2.beans.BrazilAmericano;
import week3.num2.beans.Coffee;
import week3.num2.beans.EtiopiaAmericano;
import week3.num2.beans.HawaiiAmericano;
import week3.num2.beans.KenyaAmericano;
import week3.num2.menus.Latte;
import week3.num2.menus.Mocha;
import week3.num2.menus.WhippedCream;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee etiopiaAmericano = new EtiopiaAmericano();
        etiopiaAmericano.brewing();
        System.out.println();

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Coffee brazilMocha = new Mocha(new Latte(new BrazilAmericano()));
        brazilMocha.brewing();
        System.out.println();

        Coffee hawaiiWhippedMocha =
                new WhippedCream(new Mocha(new Latte(new HawaiiAmericano())));
        hawaiiWhippedMocha.brewing();
        System.out.println();

    }
}
