package chp1;

import chp1.interfaces.IQuackBehavior;

public class Squeak implements IQuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }

}
