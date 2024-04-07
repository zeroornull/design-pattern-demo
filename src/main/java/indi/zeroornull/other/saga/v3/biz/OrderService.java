package indi.zeroornull.other.saga.v3.biz;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import indi.zeroornull.other.saga.v3.biz.step.CreateOrderStep;
import indi.zeroornull.other.saga.v3.biz.step.UpdateStockStep;
import indi.zeroornull.other.saga.v3.biz.step.UseCouponStep;
import indi.zeroornull.other.saga.v3.biz.support.OrderContext;
import indi.zeroornull.other.saga.v3.biz.support.OrderRequest;
import indi.zeroornull.other.saga.v3.biz.support.OrderResult;
import indi.zeroornull.other.saga.v3.jar.Pipeline;
import indi.zeroornull.other.saga.v3.jar.Saga;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration("orderServiceV3")
public class OrderService {

    @Resource
    private BeanFactory beanFactory;

    public void execute(Pipeline<OrderRequest, OrderResult, OrderContext> pipeline) {
        this.orderSage().execute(pipeline);
    }

    @Bean
    public Saga<OrderRequest, OrderResult, OrderContext> orderSage() {
        log.info("init orderSage");
        return Saga.<OrderRequest, OrderResult, OrderContext>builder()
                .addStage(beanFactory.getBean(CreateOrderStep.class))
                .addStage(beanFactory.getBean(UpdateStockStep.class))
                .addStage(beanFactory.getBean(UseCouponStep.class))
                .build();
    }
}
