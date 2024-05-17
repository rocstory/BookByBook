package chp4.Abstractions;

import java.util.ArrayList;

// protected keyword is needed because this abstract class is not within the
// same package (folder) as the subclasses that inherit it.
abstract public class APizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<String>();

    public APizza() {

    }

    public void prepare() {
        System.out.println("Preparing pizza...");
        System.out.println("Adding toppings:");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    protected void bake() {
        System.out.println("Baking pizza...");
    }

    protected void cut() {
        System.out.println("Cutting pizza...");
    }

    protected void box() {
        System.out.println("Boxing pizza...");
    }

    public String getName() {
        return name;
    }
}
