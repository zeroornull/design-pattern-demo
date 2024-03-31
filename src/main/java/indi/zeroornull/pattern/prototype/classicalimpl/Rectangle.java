package indi.zeroornull.pattern.prototype.classicalimpl;

import lombok.Getter;
import lombok.ToString;

import java.io.*;

@Getter
@ToString
public class Rectangle implements ShapePrototype, Serializable {

    private final Integer length;
    private final Integer width;
    private final Integer pointX;
    private final Integer pointY;
    private final transient Circle circle;

    public Rectangle(Integer length, Integer width, Integer pointX, Integer pointY,Circle circle) {
        this.length = length;
        this.width = width;
        this.pointX = pointX;
        this.pointY = pointY;
        this.circle = circle;
    }

    @Override
    public ShapePrototype copy() throws IOException, ClassNotFoundException {
        //
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        out.writeObject(this);
        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(byteIn);
        return (Rectangle) in.readObject();
    }
//    @Override
//    public ShapePrototype copy() {
//        // 创建一个新对象，并拷贝属性
//        return new Rectangle(length, width, pointX, pointY,circle);
//    }
}
