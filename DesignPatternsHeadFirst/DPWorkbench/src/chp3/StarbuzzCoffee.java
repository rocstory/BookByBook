package chp3;

import chp3.Abstractions.ABeverage;
import chp3.Beverages.DarkRoast;
import chp3.Beverages.Espresso;
import chp3.Beverages.HouseBlend;
import chp3.Condiments.Mocha;
import chp3.Condiments.Soy;
import chp3.Condiments.Whip;

public class StarbuzzCoffee {

    public void run() {
        ABeverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        ABeverage beverage2 = new DarkRoast();
        // Double Mocha
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        // With whip
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        ABeverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
