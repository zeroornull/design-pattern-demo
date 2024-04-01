package indi.zeroornull.pattern.singelton.impl4;

// 懒汉式（双重检查版，也就是Double-checked locking，简称DCL）
// 减少读锁次数
public class Person {
    private final String name;

    private Person(String name) {
        this.name = name;
    }

    private static Person INSTANCE = null;

    // 去掉方法上的synchronized
    public static Person getInstance() {
        if (INSTANCE == null) {
            // 把锁加在这
            synchronized (Person.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Person("zeroornull");
                }
            }
        }
        return INSTANCE;
    }
}
