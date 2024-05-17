package chp3.Beverages;

import chp3.Abstractions.ABeverage;

public class HouseBlend extends ABeverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }

}
