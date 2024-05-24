package chp6;

import chp6.remoteControl.MacroRemoteLoader;
import chp6.remoteControl.RemoteControlTest;
import chp6.remoteControl.RemoteLoader;

public class CommandPatternMain {
    public void run() {

        // RemoteControlTest remoteTest = new RemoteControlTest();
        // RemoteLoader remoteLoader = new RemoteLoader();
        // remoteTest.run();
        // remoteLoader.run();

        MacroRemoteLoader macroRemoteLoader = new MacroRemoteLoader();
        macroRemoteLoader.run();
    }
}
