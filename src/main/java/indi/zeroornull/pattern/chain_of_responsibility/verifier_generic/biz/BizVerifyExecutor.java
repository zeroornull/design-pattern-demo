package indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.biz;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.biz.support.BizRequest;
import indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.biz.verifier.FirstVerifier;
import indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.biz.verifier.SecondVerifier;
import indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.jar.Result;
import indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.jar.VerifyChainExecutor;

@Configuration
public class BizVerifyExecutor {

    @Resource
    private BeanFactory beanFactory;

    @Bean
    public VerifyChainExecutor<BizRequest, Result> bizVerifyChainExecutor() {
        return VerifyChainExecutor.<BizRequest, Result>builder()
                .add(beanFactory.getBean(FirstVerifier.class))
                .add(beanFactory.getBean(SecondVerifier.class))
                .build();
    }

}