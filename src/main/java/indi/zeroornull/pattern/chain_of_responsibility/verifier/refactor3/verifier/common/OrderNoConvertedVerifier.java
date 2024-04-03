package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.verifier.common;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.support.Context;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.support.Result;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.verifier.OrderConvertVerifier;

@Component("orderNoConvertedVerifierRefactor3")
public class OrderNoConvertedVerifier implements OrderConvertVerifier {

    @Override
    public Result verify(Context context) {
        System.out.println("校验订单号");
        if (ThreadLocalRandom.current().nextInt(10) > 7) {
            return Result.failed("订单已被转换");
        }
        return Result.pass();
    }
}