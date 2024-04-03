package indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.biz;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.biz.support.BizRequest;

@SpringBootTest
public class OrderConvertServiceTest {

    @Resource
    private OrderConvertService orderConvertService;

    @Test
    public void test() {
        BizRequest request = new BizRequest(9527L, "123456", 2);
        boolean convert = orderConvertService.convert(request);
        System.out.println(convert);
    }

}
