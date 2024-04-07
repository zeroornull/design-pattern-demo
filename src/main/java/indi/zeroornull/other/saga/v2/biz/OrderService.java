package indi.zeroornull.other.saga.v2.biz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Service;

import indi.zeroornull.other.saga.v2.biz.step.CreateOrderStep;
import indi.zeroornull.other.saga.v2.biz.step.UpdateStockStep;
import indi.zeroornull.other.saga.v2.biz.step.UseCouponStep;
import indi.zeroornull.other.saga.v2.jar.Saga;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service("orderServiceV2")
public class OrderService implements BeanFactoryAware {

    private final Saga<Context> orderRequestSage = new Saga<>();

    public void createOrder(Context context) {
        this.orderRequestSage.execute(context);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        orderRequestSage.addStep(beanFactory.getBean(CreateOrderStep.class));
        orderRequestSage.addStep(beanFactory.getBean(UpdateStockStep.class));
        orderRequestSage.addStep(beanFactory.getBean(UseCouponStep.class));
        log.info("orderRequestSage 初始化完成");
    }
}
