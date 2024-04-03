package indi.zeroornull.pattern.chain_of_responsibility.pipeline.biz;

import indi.zeroornull.pattern.chain_of_responsibility.pipeline.jar.Handler;

// 去除空格
public class SpaceHandler implements Handler<String, String> {
    @Override
    public String process(String input) {
        return input.trim();
    }
}
