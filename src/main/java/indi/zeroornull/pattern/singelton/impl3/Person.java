package indi.zeroornull.pattern.singelton.impl3;

// 懒汉式（synchronized版）
public class Person {
    private final String name;

    private Person(String name) {
        this.name = name;
    }

    private static Person INSTANCE = null;

    // 加上synchronized
    public static synchronized Person getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Person("zeroornull");
        }
        return INSTANCE;
    }
}
