package indi.zeroornull.other.saga.v3.biz.step;


import org.springframework.stereotype.Component;

import indi.zeroornull.other.saga.v3.biz.support.OrderContext;
import indi.zeroornull.other.saga.v3.biz.support.OrderRequest;
import indi.zeroornull.other.saga.v3.biz.support.OrderResult;
import indi.zeroornull.other.saga.v3.jar.Pipeline;
import indi.zeroornull.other.saga.v3.jar.Step;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("useCouponStepV3")
public class UseCouponStep implements Step<OrderRequest, OrderResult, OrderContext> {
    // 数据库查询用户优惠券
    private Long couponId = 123456L;

    @Override
    public void process(Pipeline<OrderRequest, OrderResult, OrderContext> pipeline) {
        log.info("使用优惠券, couponId:{}", couponId);
        couponId = null;
        pipeline.getContext().setCouponId(couponId);
    }

    @Override
    public void rollback(Pipeline<OrderRequest, OrderResult, OrderContext> pipeline) {
        Long usedCouponId = pipeline.getContext().getCouponId();
        if (usedCouponId != null) {
            log.info("回滚优惠券, couponId:{}", usedCouponId);
            couponId = usedCouponId;
        }
    }
}