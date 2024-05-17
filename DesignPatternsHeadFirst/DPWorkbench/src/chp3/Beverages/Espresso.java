package chp3.Beverages;

import chp3.Abstractions.ABeverage;

public class Espresso extends ABeverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
