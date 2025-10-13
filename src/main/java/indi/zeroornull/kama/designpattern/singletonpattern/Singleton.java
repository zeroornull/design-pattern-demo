package indi.zeroornull.kama.designpattern.singletonpattern;


// 饿汉
/*
public class Singleton {
    private static final Singleton instance = new Singleton();
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        return instance;
    }
}
*/


// 懒汉
/*public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // 私有构造方法，防止外部实例化
    }
    // 使用了同步关键字来确保线程安全, 可能会影响性能
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}*/

// 懒汉 + 双重检查锁
/*
public class Singleton {
    private static volatile Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}*/
