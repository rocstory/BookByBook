package chp1;

import chp1.interfaces.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }

}
