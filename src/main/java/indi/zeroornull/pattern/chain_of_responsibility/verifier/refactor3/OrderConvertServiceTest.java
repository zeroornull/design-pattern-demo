package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.support.OrderConvertRequest;

@SpringBootTest
public class OrderConvertServiceTest {

    @Resource(name = "orderConvertServiceRefactor3")
    private OrderConvertService orderConvertService;

    @Test
    public void test() {
        OrderConvertRequest request = new OrderConvertRequest(9527L, "123456", 2);
        boolean convert = orderConvertService.convert(request);
        System.out.println(convert);
    }

}