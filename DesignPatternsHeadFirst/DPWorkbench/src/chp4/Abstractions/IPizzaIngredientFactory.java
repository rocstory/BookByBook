package chp4.Abstractions;

import chp4.PizzaIngredients.*;

// why an interface and not a class? Does it matter?
public interface IPizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
