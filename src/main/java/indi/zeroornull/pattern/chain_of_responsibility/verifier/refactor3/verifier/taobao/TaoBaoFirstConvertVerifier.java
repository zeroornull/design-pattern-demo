package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.verifier.taobao;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.support.Context;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.support.Result;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.verifier.OrderConvertVerifier;

@Component("taoBaoFirstConvertVerifierRefactor3")
public class TaoBaoFirstConvertVerifier implements OrderConvertVerifier {

    @Override
    public Result verify(Context context) {
        System.out.println("淘宝独有校验");
        if (ThreadLocalRandom.current().nextInt(10) > 7) {
            return Result.failed("不符合淘宝校验");
        }
        return Result.pass();
    }
}