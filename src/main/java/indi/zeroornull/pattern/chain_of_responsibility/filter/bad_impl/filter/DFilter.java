package indi.zeroornull.pattern.chain_of_responsibility.filter.bad_impl.filter;

import indi.zeroornull.pattern.chain_of_responsibility.filter.Request;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Response;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DFilter extends AbstractFilter{
    @Override
    protected boolean judge(Request req, Response res) {
        log.info("DFilter");
        return true;
    }
}
