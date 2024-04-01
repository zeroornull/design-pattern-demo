package indi.zeroornull.pattern.singelton.impl5;

// 懒汉式（DCL+volatile）
public class Person {
    private final String name;

    private Person(String name) {
        this.name = name;
    }

    // 加上volatile：禁止指令重排
    private static volatile Person INSTANCE = null;

    public static Person getInstance() {
        if (INSTANCE == null) {
            synchronized (Person.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Person("zeroornull");
                }
            }
        }
        return INSTANCE;
    }

}
