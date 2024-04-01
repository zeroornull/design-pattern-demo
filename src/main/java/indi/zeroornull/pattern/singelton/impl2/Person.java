package indi.zeroornull.pattern.singelton.impl2;

//懒汉式（普通版）
public class Person {
    private final String name;

    private Person(String name) {
        this.name = name;
    }

    // 类加载时不初始化对象
    private static Person INSTANCE = null;

    // 第一次调用时才初始化（所谓“懒”）
    public static Person getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Person("zeroornull");
        }
        return INSTANCE;
    }
}
