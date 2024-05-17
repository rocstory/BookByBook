package chp4.SimpleFactory;

import chp4.SimpleFactory.SimplePizzas.ISimplePizza;
import chp4.SimpleFactory.SimplePizzas.SimpleCheesePizza;
import chp4.SimpleFactory.SimplePizzas.SimpleClamPizza;
import chp4.SimpleFactory.SimplePizzas.SimplePepperoniPizza;
import chp4.SimpleFactory.SimplePizzas.SimpleVeggiePizza;

public class SimplePizzaFactory {

    public ISimplePizza createPizza(String type) {
        ISimplePizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new SimpleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new SimplePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new SimpleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new SimpleVeggiePizza();
        }
        return pizza;
    }

}
