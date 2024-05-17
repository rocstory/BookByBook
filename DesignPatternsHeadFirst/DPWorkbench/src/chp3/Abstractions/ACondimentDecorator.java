package chp3.Abstractions;

public abstract class ACondimentDecorator extends ABeverage {
    protected ABeverage beverage;

    // you're telling each concrete class to define its own getDescription method.
    public abstract String getDescription();
}
