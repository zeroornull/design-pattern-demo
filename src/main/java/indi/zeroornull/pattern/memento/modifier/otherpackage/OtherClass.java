package indi.zeroornull.pattern.memento.modifier.otherpackage;

import indi.zeroornull.pattern.memento.modifier.mypackage.MainClass;
//import indi.zeroornull.pattern.memento.modifier.mypackage.SubClass;

public class OtherClass {
    public static void main(String[] args) {
        // 可以访问
        MainClass mainClass = new MainClass();
        // 编译报错：SubClass is not public, cannot be accessed from outside package
        // SubClass subClass = new SubClass();
    }
}
