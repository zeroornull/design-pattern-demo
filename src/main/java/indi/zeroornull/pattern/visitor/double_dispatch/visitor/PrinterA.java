package indi.zeroornull.pattern.visitor.double_dispatch.visitor;

import indi.zeroornull.pattern.visitor.double_dispatch.inheritance.Father;
import indi.zeroornull.pattern.visitor.double_dispatch.inheritance.Son;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrinterA implements Printer{
    @Override
    public void print(Father father) {
        log.info("print father in PrinterA");
    }

    @Override
    public void print(Son son) {
        log.info("print son in PrinterA");
    }
}
