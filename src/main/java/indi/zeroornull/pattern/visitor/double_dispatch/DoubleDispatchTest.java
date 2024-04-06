package indi.zeroornull.pattern.visitor.double_dispatch;

import indi.zeroornull.pattern.visitor.double_dispatch.inheritance.Father;
import indi.zeroornull.pattern.visitor.double_dispatch.inheritance.Son;
import indi.zeroornull.pattern.visitor.double_dispatch.visitor.PrinterA;
import indi.zeroornull.pattern.visitor.double_dispatch.visitor.PrinterB;

/**
 * Father和Son代表对象结构
 * Printer则是Visitor
 */
public class DoubleDispatchTest {

    public static void main(String[] args) {
        Father man = new Son();
        // 动态分派
        man.say();          // 方法重写（Son实例）：say in Son
        // 静态分派
        PrinterA printerA = new PrinterA();
        printerA.print(man);
        
        // 双重分派
        man.accept(printerA);
        
         PrinterB printerB = new PrinterB();
         man.accept(printerB);
    }
    
}
