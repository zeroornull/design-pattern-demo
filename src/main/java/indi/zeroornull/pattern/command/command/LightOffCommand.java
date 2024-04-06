package indi.zeroornull.pattern.command.command;

import indi.zeroornull.pattern.command.receiver.LightReceiver;

public class LightOffCommand implements Command{
    private LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
