package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.verifychain;

import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.support.Context;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.support.OrderConvertRequest;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.support.Result;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.verifier.ChannelRelationBindingVerifier;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.verifier.OrderConvertVerifier;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.verifier.OrderNoConvertedVerifier;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("orderConvertVerifyChainRefactor2")
public class OrderConvertVerifyChain implements BeanFactoryAware {

    private List<OrderConvertVerifier> verifiers;

    public Result verify(OrderConvertRequest request) {
        Context context = new Context();
        context.setRequest(request);
        for (OrderConvertVerifier verifier : verifiers) {
            Result result = verifier.verify(context);
            if (!result.isPass()) {
                return result;
            }
        }
        return Result.pass();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.verifiers = Arrays.asList(beanFactory.getBean(OrderNoConvertedVerifier.class),
            beanFactory.getBean(ChannelRelationBindingVerifier.class));
    }
}
