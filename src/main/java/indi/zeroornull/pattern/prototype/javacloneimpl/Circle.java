package indi.zeroornull.pattern.prototype.javacloneimpl;

import lombok.ToString;

@ToString
public class Circle implements Cloneable{// 1.直接实现JDK的Cloneable，不需要另外定义Prototype接口或抽象类
    private final Integer radius;
    private final Integer pointX;
    private final Integer pointY;

    public Circle(Integer radius, Integer pointX, Integer pointY) {
        this.radius = radius;
        this.pointX = pointX;
        this.pointY = pointY;
    }
    
    public Circle copy() {
        try {
            return (Circle) super.clone(); // 2.调用super.clone()完成对象复制
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
