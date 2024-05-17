package chp3.Condiments;

import chp3.Abstractions.ABeverage;
import chp3.Abstractions.ACondimentDecorator;

public class Soy extends ACondimentDecorator {
    public Soy(ABeverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + .15;
    }

}
