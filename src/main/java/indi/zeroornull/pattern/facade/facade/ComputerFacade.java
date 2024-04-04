package indi.zeroornull.pattern.facade.facade;

import indi.zeroornull.pattern.facade.computer.CPU;
import indi.zeroornull.pattern.facade.computer.HardDrive;
import indi.zeroornull.pattern.facade.computer.Memory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComputerFacade {
    
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }
    
    // 启动电脑
    public void start() {
        cpu.start();
        memory.load();
        hardDrive.read();
        log.info("Computer is started");
    }
    
    // 关闭电脑
    public void shutdown() {
        cpu.shutdown();
        memory.unload();
        hardDrive.write();
        log.info("Computer is shut down");
    }
}
