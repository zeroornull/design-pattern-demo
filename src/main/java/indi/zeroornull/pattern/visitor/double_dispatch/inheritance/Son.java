package indi.zeroornull.pattern.visitor.double_dispatch.inheritance;

import indi.zeroornull.pattern.visitor.double_dispatch.visitor.Printer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Son extends Father{
    
        @Override
        public void say() {
            log.info("say in Son");
        }
    
        public void accept(Printer printer) {
            printer.print(this);
        }
}
