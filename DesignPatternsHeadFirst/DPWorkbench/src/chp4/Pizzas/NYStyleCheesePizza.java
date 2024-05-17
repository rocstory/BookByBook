package chp4.Pizzas;

import chp4.Abstractions.APizza;

public class NYStyleCheesePizza extends APizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");

    }
}
