package chp3.Condiments;

import chp3.Abstractions.ABeverage;
import chp3.Abstractions.ACondimentDecorator;

public class SteamedMilk extends ACondimentDecorator {

    public SteamedMilk(ABeverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return beverage.cost() + .10;
    }

}
