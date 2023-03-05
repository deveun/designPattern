package remoteControl.command.ceilingfan;

import remoteControl.command.Command;
import remoteControl.device.CeilingFan;
import remoteControl.device.CeilingFan.Speed;

public abstract class CeilingFanCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    protected void doCommand(Speed speed) {
        switch(speed) {
            case HIGH -> ceilingFan.high();
            case MEDIUM -> ceilingFan.medium();
            case LOW -> ceilingFan.low();
            case OFF -> ceilingFan.off();
        }
    }
}
