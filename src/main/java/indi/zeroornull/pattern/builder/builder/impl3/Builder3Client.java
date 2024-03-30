package indi.zeroornull.pattern.builder.builder.impl3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Builder3Client {

    public static void main(String[] args) {
        Product product = Product.builder().step1("第一步").step2("第二步").step3("第三步").build();
        log.info(String.valueOf(product));
    }
}
