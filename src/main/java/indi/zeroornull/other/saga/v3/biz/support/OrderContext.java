package indi.zeroornull.other.saga.v3.biz.support;

import lombok.Data;

@Data
public class OrderContext {
    private String orderId;
    private Integer skuDeduceNum;
    private Long couponId;
}
