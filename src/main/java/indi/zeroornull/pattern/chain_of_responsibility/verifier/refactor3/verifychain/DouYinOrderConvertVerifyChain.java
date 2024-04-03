package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.verifychain;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.support.ChannelEnum;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.verifier.OrderConvertVerifier;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.verifier.common.ChannelRelationBindingVerifier;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.verifier.common.OrderNoConvertedVerifier;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.verifier.douyin.DouYinFirstConvertVerifier;

@Component("douYinOrderConvertVerifyChainRefactor3")
public class DouYinOrderConvertVerifyChain extends AbstractOrderConvertVerifyChain implements BeanFactoryAware {

    private List<OrderConvertVerifier> verifiers;

    @Override
    public boolean match(Integer channel) {
        return ChannelEnum.DOU_YIN.getCode().equals(channel);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.verifiers = Arrays.asList(
                beanFactory.getBean(OrderNoConvertedVerifier.class),
                beanFactory.getBean(ChannelRelationBindingVerifier.class),
                beanFactory.getBean(DouYinFirstConvertVerifier.class)
        );
    }

    @Override
    protected List<OrderConvertVerifier> getVerifiers() {
        return verifiers;
    }
}