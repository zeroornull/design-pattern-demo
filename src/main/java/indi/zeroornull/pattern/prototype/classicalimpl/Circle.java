package indi.zeroornull.pattern.prototype.classicalimpl;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Circle implements ShapePrototype{
    
    private final Integer radius;
    private final Integer pointX;
    private final Integer pointY;

    public Circle(Integer radius, Integer pointX, Integer pointY) {
        this.radius = radius;
        this.pointX = pointX;
        this.pointY = pointY;
    }

    @Override
    public ShapePrototype copy() {
        return new Circle(radius,pointX,pointY);
    }
}
