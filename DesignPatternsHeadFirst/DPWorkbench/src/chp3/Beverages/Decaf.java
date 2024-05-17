package chp3.Beverages;

import chp3.Abstractions.ABeverage;

public class Decaf extends ABeverage {
    public Decaf() {
        description = "Dark Roast";
    }

    public double cost() {
        return 1.05;
    }
}
