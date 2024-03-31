package indi.zeroornull.pattern.prototype.classicalimpl;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class PrototypeClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 假设这是已有的一个对象
        Circle circle = new Circle(5, 0, 0);
        // 出于一些原因，你需要拷贝这个对象
        Circle cloneCircle = (Circle)circle.copy();

        log.info("原对象：" + circle);
        log.info("克隆对象：" + cloneCircle);
        log.info("地址是否相等：" + (circle == cloneCircle));

        Rectangle rectangle = new Rectangle(5, 10, 0, 0, circle);
        Rectangle cloneRectangle = (Rectangle)rectangle.copy();
        log.info("原对象：" + rectangle);
        log.info("克隆对象：" + cloneRectangle);
        log.info("地址是否相等：" + (rectangle == cloneRectangle));
        log.info("circle地址是否相等：" + (rectangle.getCircle() == cloneRectangle.getCircle()));
    }
}
