package indi.zeroornull.other.saga.v3;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import indi.zeroornull.other.saga.v3.biz.OrderService;
import indi.zeroornull.other.saga.v3.biz.support.OrderContext;
import indi.zeroornull.other.saga.v3.biz.support.OrderRequest;
import indi.zeroornull.other.saga.v3.biz.support.OrderResult;
import indi.zeroornull.other.saga.v3.jar.Pipeline;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class SagaClientV3 {

    @Resource(name = "orderServiceV3")
    private OrderService orderService;

    @Test
    public void userOrderRequest() {
        OrderRequest orderRequest = new OrderRequest(10086L, 3);
        OrderResult orderResult = new OrderResult();
        OrderContext orderContext = new OrderContext();
        Pipeline<OrderRequest, OrderResult, OrderContext> pipeline = new Pipeline<>(orderRequest, orderResult, orderContext);
        orderService.execute(pipeline);
        log.info("orderResult:{}", pipeline.getResponse());
    }
}