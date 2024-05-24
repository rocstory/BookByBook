package chp6.remoteControl;

public class RemoteLoader {
    public void run() {
        // RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // Light livingRoomLight = new Light("Living Room");

        // LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        // LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        // remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        // remoteControl.onButtonWasPushed(0);
        // remoteControl.offButtonWasPushed(0);
        // System.out.println(remoteControl);

        // remoteControl.undoButtonWasPushed();
        // remoteControl.offButtonWasPushed(0);
        // remoteControl.onButtonWasPushed(0);
        // System.out.println(remoteControl);
        // remoteControl.undoButtonWasPushed();

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
