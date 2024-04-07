package indi.zeroornull.other.lazy_loading;

public class LazyLoadingExample {
    public static void main(String[] args) {
        // 创建 Car 对象
        Car myCar = new Car();

        // 在调用 drive 方法之前，Engine 对象并没有被创建
        myCar.drive();

        // 再次调用 drive 方法时，由于 Engine 已经被创建，不会再次初始化
        myCar.drive();
    }
}