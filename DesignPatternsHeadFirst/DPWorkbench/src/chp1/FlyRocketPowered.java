package chp1;

import chp1.interfaces.IFlyBehavior;

public class FlyRocketPowered implements IFlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
