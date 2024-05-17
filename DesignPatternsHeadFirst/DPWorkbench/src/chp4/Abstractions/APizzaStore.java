package chp4.Abstractions;

public abstract class APizzaStore {
    public APizza orderPizza(String type) {
        APizza pizza;
        pizza = createPizza(type); // encapsulating what varies

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // let the subclasses define their own way of creating their pizzas
    protected abstract APizza createPizza(String type);
}
