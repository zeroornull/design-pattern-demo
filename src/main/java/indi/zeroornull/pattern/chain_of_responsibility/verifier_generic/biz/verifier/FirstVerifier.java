package indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.biz.verifier;

import org.springframework.stereotype.Component;

import indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.biz.support.BizRequest;
import indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.jar.Result;
import indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.jar.Verifier;

@Component
public class FirstVerifier implements Verifier<BizRequest, Result> {

    @Override
    public Result verify(BizRequest request) {
        System.out.println("FirstVerifier");
        return Result.pass();
    }

}