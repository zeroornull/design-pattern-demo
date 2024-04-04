package indi.zeroornull.pattern.facade.computer;

import lombok.extern.slf4j.Slf4j;

// 子系统 3：硬盘
@Slf4j
public class HardDrive {
    public void read() {
        log.info("HardDrive is reading");
    }

    public void write() {
        log.info("HardDrive is writing");
    }
}
