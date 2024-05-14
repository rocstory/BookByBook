package chp1;

import chp1.interfaces.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
