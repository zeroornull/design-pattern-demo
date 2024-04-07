package indi.zeroornull.other.saga.v2;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import indi.zeroornull.other.saga.v2.biz.Context;
import indi.zeroornull.other.saga.v2.biz.OrderService;

@SpringBootTest
public class SagaClientV2 {

    @Resource(name = "orderServiceV2")
    private OrderService orderService;

    @Test
    public void userOrderRequest() {
        Context context = new Context();
        context.setRequestProdId(10086L);
        context.setRequestBuyNum(3);

        orderService.createOrder(context);
    }
}