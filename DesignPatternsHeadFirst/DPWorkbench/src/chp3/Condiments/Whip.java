package chp3.Condiments;

import chp3.Abstractions.ABeverage;
import chp3.Abstractions.ACondimentDecorator;

public class Whip extends ACondimentDecorator {
    public Whip(ABeverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + .10;
    }

}
