package chp6.remoteControl;

public class MacroCommand implements Command {
    Command[] commands;

    // Take an array of commands and store them in the MacroCommand
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    // when a macro gets executed by the remote, execute those commands
    // one at a time.

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    // Commands have to be done backwards to ensure proper
    // undo functionality
    public void undo() {
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}
