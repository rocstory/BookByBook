package chp4.Pizzas;

import chp4.Abstractions.APizza;

public abstract class ChicagoStyleCheesePizza extends APizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
