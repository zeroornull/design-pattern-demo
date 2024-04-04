package indi.zeroornull.pattern.facade.computer;

import lombok.extern.slf4j.Slf4j;

// 子系统 1：CPU
@Slf4j
public class CPU {
    public void start() {
        log.info("CPU is starting");
    }

    public void shutdown() {
        log.info("CPU is shutting down");
    }
}
