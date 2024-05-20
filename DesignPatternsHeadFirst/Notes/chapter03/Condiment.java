// C3P99 - SYP
package chp3.Abstractions;

public abstract class ACondimentDecorator extends ABeverage {
    protected ABeverage beverage;

    // you're telling each concrete class to define its own getDescription method.
    public abstract String getDescription();

    // If the cost of each condiment had a different price for each
    // size, I would make this an abstract class...
    // Note: I checked the solution and there wasn't a need for a seperate function?
    // for clearity I added it...
    public double getSizeCost() {
        double beverageSize = this.beverage.getSize();

        if (beverageSize == this.beverage.TALL) {
            return 0.20;
        } else if (beverageSize == this.beverage.GRANDE) {
            return 0.15;
        } else if (beverageSize == this.beverage.VENTI) {
            return 0.10;
        }
    }

}

public class Condiment extends ACondimentDecorator {
    public Condiment(ABeverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + getSizeCost(); // size function here
    }

}
