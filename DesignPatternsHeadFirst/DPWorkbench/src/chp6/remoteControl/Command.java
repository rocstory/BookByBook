package chp6.remoteControl;

public interface Command {
    public void execute();

    public void undo();
}
