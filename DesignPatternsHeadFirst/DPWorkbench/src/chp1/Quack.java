package chp1;

import chp1.interfaces.IQuackBehavior;

public class Quack implements IQuackBehavior {

    public void quack() {
        System.out.println("Quack");
    }

}
