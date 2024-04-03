package indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl.filter;

import indi.zeroornull.pattern.chain_of_responsibility.filter.Request;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Response;
import indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl.chain.FilterChain;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogFilter implements Filter{

    @Override
    public void doFilter(Request req, Response res, FilterChain filterChain) {
        // 前置操作
        log.info("log start ...");

        // 直接放行到下一个Filter
        filterChain.doFilter(req, res);

        // 后置处理
        log.info("log end ...");
    }
}
