package remoteControl.command;

public interface Command {
    void execute();

    void undo();
}
