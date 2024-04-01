package indi.zeroornull.pattern.singelton.impl1;

// 饿汉式
public class Person {
    private final String name;

    // 私有构造器，防止外界new
    private Person(String name) {
        this.name = name;
    }
    
    private static final Person INSTANCE = new Person("zeroornull");
    public static Person getInstance() {
        return INSTANCE;
    }
}
