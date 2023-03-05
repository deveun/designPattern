package remoteControl.command.ceilingfan;

import remoteControl.device.CeilingFan;
import remoteControl.device.CeilingFan.Speed;

public class CeilingFanLowCommand extends CeilingFanCommand {

    private Speed prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        super.doCommand(prevSpeed);
    }
}
