package remoteControl.command.ceilingfan;

import remoteControl.device.CeilingFan;
import remoteControl.device.CeilingFan.Speed;

public class CeilingFanOffCommand extends CeilingFanCommand {

    private Speed prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        super.doCommand(prevSpeed);
    }
}
