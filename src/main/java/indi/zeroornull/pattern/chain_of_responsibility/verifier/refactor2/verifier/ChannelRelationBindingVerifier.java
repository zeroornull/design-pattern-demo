package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.verifier;

import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.support.Context;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.support.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("channelRelationBindingVerifierRefactor2")
@Slf4j
public class ChannelRelationBindingVerifier implements OrderConvertVerifier{

    @Override
    public Result verify(Context context) {
        log.info("校验渠道账号");
        if (ThreadLocalRandom.current().nextInt(10) > 6) {
            return Result.fail("账号已被绑定");
        }
        return Result.pass();
    }
}
