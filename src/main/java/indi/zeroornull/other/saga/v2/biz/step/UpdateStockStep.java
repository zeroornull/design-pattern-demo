package indi.zeroornull.other.saga.v2.biz.step;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

import indi.zeroornull.other.saga.v2.biz.Context;
import indi.zeroornull.other.saga.v2.jar.HaltException;
import indi.zeroornull.other.saga.v2.jar.Step;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("updateStockStepV2")
public class UpdateStockStep implements Step<Context> {
    // 数据库查询商品库存
    private Integer stock = 100;

    @Override
    public void execute(Context context) {
        if (ThreadLocalRandom.current().nextBoolean()) {
            log.info("扣减库存, 操作前:{}, 操作后:{}", stock, stock -= context.getRequestBuyNum());
            context.setContextSkuDeduceNum(context.getRequestBuyNum());
        } else {
            log.error("扣减库存失败，无库存");
            throw new HaltException("无库存");
        }
    }

    @Override
    public void rollback(Context context) {
        if (context.getContextSkuDeduceNum() != null) {
            log.info("回滚库存, 操作前:{}, 操作后:{}", stock, stock += context.getRequestBuyNum());
        }
    }
}