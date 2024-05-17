package chp3.Condiments;

import chp3.Abstractions.ABeverage;
import chp3.Abstractions.ACondimentDecorator;

public class Mocha extends ACondimentDecorator {
    public Mocha(ABeverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + .20;
    }

}
