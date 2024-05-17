package chp4.SimpleFactory;

import chp4.SimpleFactory.SimplePizzas.ISimplePizza;

public class SimplePizzaStore {
    SimplePizzaFactory factory;

    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public ISimplePizza orderPizza(String type) {
        ISimplePizza pizza;
        pizza = factory.createPizza(type); // here - the simple factory is responsible for creating the pizza

        // did not implement for the sake of time.
        // pizza.prepare();
        // pizza.bake();
        // pizza.cut();
        // pizza.box();
        return pizza;
    }
}
