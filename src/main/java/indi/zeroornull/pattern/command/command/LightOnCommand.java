package indi.zeroornull.pattern.command.command;

import indi.zeroornull.pattern.command.receiver.LightReceiver;

public class LightOnCommand implements Command {
    private LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();

    }
}
