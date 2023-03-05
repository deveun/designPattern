package remoteControl;

import remoteControl.command.Command;
import remoteControl.command.NoCommand;

public class RemoteControl {

    private int buttonNum;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(int buttonNum) {
        this.buttonNum = buttonNum;

        onCommands = new Command[buttonNum];
        offCommands = new Command[buttonNum];

        NoCommand noCommand = new NoCommand();
        for(int i=0; i<buttonNum; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        undoCommand = onCommands[slot];
        onCommands[slot].execute();
    }

    public void offButtonPushed(int slot) {
        undoCommand = offCommands[slot];
        offCommands[slot].execute();
    }

    public void undoButtonPushed() {
        System.out.print("undo! - ");
        undoCommand.undo();
    }
}
