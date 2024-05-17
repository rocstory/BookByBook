package chp3.Beverages;

import chp3.Abstractions.ABeverage;

public class DarkRoast extends ABeverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        return 0.99;
    }
}
