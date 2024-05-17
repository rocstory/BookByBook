package chp3.Abstractions;

// why an abstraction and not an interface??
public abstract class ABeverage {
    // not mentioned in the book but description needs to be protected
    // so that the sub classes can access it.

    // TODO:: Check if their source code has this variable protected...
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
