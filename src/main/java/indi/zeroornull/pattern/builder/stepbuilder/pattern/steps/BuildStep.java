package indi.zeroornull.pattern.builder.stepbuilder.pattern.steps;

import indi.zeroornull.pattern.builder.stepbuilder.pattern.Product;

public interface BuildStep {
    // 最后一步返回Product
    Product build();
}
