package indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl.filter;

import indi.zeroornull.pattern.chain_of_responsibility.filter.Request;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Response;
import indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl.chain.FilterChain;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ThreadLocalRandom;

@Slf4j
public class EncodeFilter implements Filter {
    @Override
    public void doFilter(Request req, Response res, FilterChain filterChain) {
        // 前置操作
        log.info("Encode start ...");
        // 随机拦截，阻止请求到达Servlet
        if (ThreadLocalRandom.current().nextInt(10) > 5) {
            filterChain.doFilter(req, res);
        } else {
            log.info("EncodeFilter 终止...");
        }

        // 后置处理
        log.info("Encode end ...");

    }
}
