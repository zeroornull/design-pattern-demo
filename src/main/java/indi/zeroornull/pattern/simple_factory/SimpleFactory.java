package indi.zeroornull.pattern.simple_factory;

import indi.zeroornull.pattern.simple_factory.product.AProduct;
import indi.zeroornull.pattern.simple_factory.product.AbstractProduct;
import indi.zeroornull.pattern.simple_factory.product.BProduct;

public class SimpleFactory {
    
    public static AbstractProduct createProduct(String type) {
        if ("A".equals(type)) {
            return new AProduct();
        } else if ("B".equals(type)) {
            return new BProduct();
        } else {
            throw new RuntimeException("产品类型错误");
        }
    }
}
