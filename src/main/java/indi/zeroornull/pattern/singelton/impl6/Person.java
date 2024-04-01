package indi.zeroornull.pattern.singelton.impl6;

// 静态内部类
// 只有当调用getInstance()方法时，SingletonHolder才会首次被加载，而在加载和初始化静态内部类的过程中，JVM会保证线程安全性。懒加载的同时，还避免了线程安全问题。
public class Person {
    private final String name;

    private Person(String name) {
        this.name = name;
    }

    private static final class SingletonHolder {
        static final Person INSTANCE = new Person("zeroornull");
    }

    // 去掉方法上的synchronized
    public static Person getInstance() {
        // 把锁加在这
        return SingletonHolder.INSTANCE;
    }
}
