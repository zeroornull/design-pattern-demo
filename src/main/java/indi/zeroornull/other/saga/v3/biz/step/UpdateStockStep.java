package indi.zeroornull.other.saga.v3.biz.step;


import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

import indi.zeroornull.other.saga.v2.jar.HaltException;
import indi.zeroornull.other.saga.v3.biz.support.OrderContext;
import indi.zeroornull.other.saga.v3.biz.support.OrderRequest;
import indi.zeroornull.other.saga.v3.biz.support.OrderResult;
import indi.zeroornull.other.saga.v3.jar.Pipeline;
import indi.zeroornull.other.saga.v3.jar.Step;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("updateStockStepV3")
public class UpdateStockStep implements Step<OrderRequest, OrderResult, OrderContext> {
    // 数据库查询商品库存
    private Integer stock = 100;


    @Override
    public void process(Pipeline<OrderRequest, OrderResult, OrderContext> pipeline) {
        if (ThreadLocalRandom.current().nextBoolean()) {
            log.info("扣减库存, 操作前:{}, 操作后:{}", stock, stock -= pipeline.getRequest().getBuyNum());
            pipeline.getContext().setSkuDeduceNum(pipeline.getRequest().getBuyNum());
        } else {
            log.error("扣减库存失败，无库存");
            throw new HaltException("无库存");
        }

    }

    @Override
    public void rollback(Pipeline<OrderRequest, OrderResult, OrderContext> pipeline) {
        if (pipeline.getContext().getSkuDeduceNum() != null) {
            log.info("回滚库存, 操作前:{}, 操作后:{}", stock, stock += pipeline.getRequest().getBuyNum());
        }
    }
}