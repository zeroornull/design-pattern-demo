package indi.zeroornull.pattern.prototype.classicalimpl;

import java.io.IOException;

public interface ShapePrototype {
    /**
     * 要求子类支持拷贝。
     * 所谓拷贝，类型一定与原来一致，所以返回值类型也是ShapePrototype
     */
    ShapePrototype copy() throws IOException, ClassNotFoundException;
}
