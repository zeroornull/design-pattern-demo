package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.verifychain;

import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.support.OrderConvertRequest;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.support.Result;

// 将VerifyChain抽象为接口
public interface OrderConvertVerifyChain {

    // 用于渠道匹配
    boolean match(Integer channel);

    // 订单转换校验
    Result verify(OrderConvertRequest request);

}