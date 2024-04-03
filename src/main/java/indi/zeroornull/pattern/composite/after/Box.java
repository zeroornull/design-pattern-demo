package indi.zeroornull.pattern.composite.after;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合节点
 */
public class Box implements BoxComponent{
    private final List<BoxComponent> boxComponents = new ArrayList<>();
    
    public void add(BoxComponent boxComponent){
        this.boxComponents.add(boxComponent);
    }

    @Override
    public double calculatePrice() {
        double totalSum = 0;
        for (BoxComponent boxComponent : boxComponents) {
            totalSum += boxComponent.calculatePrice();
        }
        return totalSum;
    }
}
