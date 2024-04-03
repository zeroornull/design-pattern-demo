package indi.zeroornull.pattern.chain_of_responsibility.filter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Servlet {
    public void service(Request req, Response res) {
        log.info("Servlet执行");
    }
}