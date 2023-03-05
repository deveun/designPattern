package remoteControl;

import remoteControl.command.Command;
import remoteControl.command.MacroCommand;
import remoteControl.command.ceilingfan.CeilingFanHighCommand;
import remoteControl.command.ceilingfan.CeilingFanLowCommand;
import remoteControl.command.ceilingfan.CeilingFanOffCommand;
import remoteControl.command.light.LightOffCommand;
import remoteControl.command.light.LightOnCommand;
import remoteControl.device.CeilingFan;
import remoteControl.device.Light;

public class RemoteControlSimulator {

    public static int BUTTON_NUM = 6;

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(BUTTON_NUM);

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kichen");
        CeilingFan ceilingFan = new CeilingFan();

        // create command
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        //macro command
        Command[] macro = new Command[] {livingRoomLightOn, kitchenRoomLightOn, ceilingFanHigh};
        MacroCommand macroCommand = new MacroCommand(macro);

        // set command
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff); // slot 0 -> 거실 전등 on / off
        remote.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff); // slot 1 -> 주방 전등 on / off
        remote.setCommand(2, ceilingFanLow, ceilingFanOff); // slot 2 -> 선풍기 low / off
        remote.setCommand(3, ceilingFanHigh, ceilingFanOff); // slot 3 -> 선풍기 high / off
        remote.setCommand(4, macroCommand, null); // slot 4 -> macro (light & ceilingFan on)
        // command클래스에 execute() 하나만 가지고 있다면
        // --> lambda 를 통해 구상 커맨드 객체 없이 구현 가능!!
        // remote.setCommand(2, () -> toiletLight.on(), () -> toiletLight.off());

        // test
        lightOnOffTest(remote);
        ceilingFanTest(remote);
        macroTest(remote);
        noCommandTest(remote);
    }

    public static void lightOnOffTest(RemoteControl remote) {
        System.out.println("=====lightOnOffTest=====");
        remote.onButtonPushed(0); // living room light on
        remote.offButtonPushed(0); // living room light off
        remote.onButtonPushed(1); // kitchen light on
        remote.offButtonPushed(1); // kitchen light off
        remote.undoButtonPushed();
    }

    public static void ceilingFanTest(RemoteControl remote) {
        System.out.println("=====ceilingFanTest=====");
        remote.onButtonPushed(2);
        remote.offButtonPushed(2);
        remote.onButtonPushed(3);
        remote.offButtonPushed(3);
        remote.undoButtonPushed();

    }

    public static void macroTest(RemoteControl remote) {
        System.out.println("=====macroTest=====");
        remote.onButtonPushed(4);
        remote.undoButtonPushed();
    }

    public static void noCommandTest(RemoteControl remote) {
        System.out.println("=====noCommandTest======");
        remote.onButtonPushed(BUTTON_NUM-1);
        remote.offButtonPushed(BUTTON_NUM-1);
    }
}
