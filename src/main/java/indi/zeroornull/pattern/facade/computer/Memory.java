package indi.zeroornull.pattern.facade.computer;

import lombok.extern.slf4j.Slf4j;

// 子系统 2：内存
@Slf4j
public class Memory {
    public void load() {
        log.info("Memory is loading");
    }

    public void unload() {
        log.info("Memory is unloading");
    }
}
