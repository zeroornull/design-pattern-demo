package indi.zeroornull.pattern.command;


import indi.zeroornull.pattern.command.command.LightOffCommand;
import indi.zeroornull.pattern.command.command.LightOnCommand;
import indi.zeroornull.pattern.command.command.RemoteControl;
import indi.zeroornull.pattern.command.receiver.LightReceiver;

public class Client {
    public static void main(String[] args) {
        LightReceiver livingRoomLight = new LightReceiver();
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remoteControl = new RemoteControl();

        // 按下开灯按钮
        remoteControl.setCommand(livingRoomLightOn);
        remoteControl.pressButton();

        // 按下关灯按钮
        remoteControl.setCommand(livingRoomLightOff);
        remoteControl.pressButton();
        
    }
}
