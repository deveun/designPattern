package remoteControl.command.ceilingfan;

import remoteControl.device.CeilingFan;
import remoteControl.device.CeilingFan.Speed;

public class CeilingFanHighCommand extends CeilingFanCommand {

    private Speed prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        super.doCommand(prevSpeed);
    }
}
