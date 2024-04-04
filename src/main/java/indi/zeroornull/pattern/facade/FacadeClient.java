package indi.zeroornull.pattern.facade;

import indi.zeroornull.pattern.facade.facade.ComputerFacade;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FacadeClient {
    public static void main(String[] args) {
        // 使用 Facade 启动和关闭电脑
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        log.info("---------");
        computer.shutdown();
    }
}
