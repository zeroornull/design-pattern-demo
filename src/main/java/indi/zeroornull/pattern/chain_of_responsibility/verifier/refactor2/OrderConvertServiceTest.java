package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.support.OrderConvertRequest;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class OrderConvertServiceTest {
    @Resource(name = "orderConvertServiceByVerifyChain")
    private OrderConvertService orderConvertService;
    
    @Test
    public void test() {
        OrderConvertRequest request = new OrderConvertRequest(9527L, "123456", 1);
        boolean convert = orderConvertService.convert(request);
        log.info(String.valueOf(convert));
    }
}
