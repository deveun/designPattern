package remoteControl.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("button is not active"); // default
    }

    @Override
    public void undo() {
        System.out.println("button is not active"); // default
    }
}
