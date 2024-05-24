package chp6.remoteControl;

// import headfirst.designpatterns.command.remote.CeilingFan;
// import headfirst.designpatterns.command.remote.CeilingFanOffCommand;
// import headfirst.designpatterns.command.remote.GarageDoorDownCommand;

public class RemoteControlTest {
    public void run() {
        // SimpleRemoteControl remote = new SimpleRemoteControl(); // the invoker
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room"); // the receiver
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        // LightOnCommand lightOn = new LightOnCommand(light); // the command
        // GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        // remote.setCommand(lightOn);
        // remote.buttonWasPressed();
        // remote.setCommand(garageOpen);
        // remote.buttonWasPressed();
    }
}

// C6P205 SYP
// The output is:
// "Light is on"
// "Garage door is open!"