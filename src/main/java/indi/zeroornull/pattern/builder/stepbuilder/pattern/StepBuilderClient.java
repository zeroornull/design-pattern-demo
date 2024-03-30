package indi.zeroornull.pattern.builder.stepbuilder.pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StepBuilderClient {

    public static void main(String[] args) {
        Product product = Product.builder()
                .step1("step1")
                .step2("step2")
                .step3("step3")
                .build();
        log.info(String.valueOf(product));
    }
    
    
}
