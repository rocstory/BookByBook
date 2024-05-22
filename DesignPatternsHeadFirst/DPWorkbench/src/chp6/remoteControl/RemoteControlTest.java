package chp6.remoteControl;

public class RemoteControlTest {
    public void run() {
        SimpleRemoteControl remote = new SimpleRemoteControl(); // the invoker

        Light light = new Light(); // the receiver
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light); // the command
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}

// C6P205 SYP
// The output is:
// "Light is on"
// "Garage door is open!"