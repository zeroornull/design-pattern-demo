package indi.zeroornull.pattern.simple_factory;

import indi.zeroornull.pattern.simple_factory.product.AbstractProduct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public void method(String type) {
        AbstractProduct product = SimpleFactory.createProduct(type);
        log.info("product: {}", product);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.method("A");
    }

}
