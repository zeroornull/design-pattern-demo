package indi.zeroornull.pattern.facade;

import indi.zeroornull.pattern.facade.computer.CPU;
import indi.zeroornull.pattern.facade.computer.HardDrive;
import indi.zeroornull.pattern.facade.computer.Memory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NormalClient {

    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        // 启动电脑
        cpu.start();
        memory.load();
        hardDrive.read();
        log.info("Computer is started");

        // 使用电脑...
        log.info("---------");

        // 关闭电脑
        cpu.shutdown();
        memory.unload();
        hardDrive.write();
        log.info("Computer is shut down");
    }

}
