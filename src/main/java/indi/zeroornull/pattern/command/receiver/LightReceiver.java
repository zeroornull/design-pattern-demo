package indi.zeroornull.pattern.command.receiver;

import lombok.extern.slf4j.Slf4j;

/******** 2.接收者：灯 ********/
@Slf4j
public class LightReceiver {
    public void turnOn() {
        log.info("Light is ON");
    }
    
    public void turnOff() {
        log.info("Light is OFF");
    }
}
