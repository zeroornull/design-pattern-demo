package indi.zeroornull.other.lazy_loading;

// Car 类，包含一个 Engine 对象
class Car {
    private Engine engine;

    public Car() {
        // engine = new Engine(); // 如果在这里初始化，就不是懒加载了
    }

    // 获取 Engine 对象：如果 engine 为 null，则进行初始化
    public Engine getEngine() {
        if (engine == null) {
            engine = new Engine();
        }
        return engine;
    }

    public void drive() {
        // 使用引擎行驶
        getEngine().start();
        System.out.println("Car is driving");
    }
}
