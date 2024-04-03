package indi.zeroornull.pattern.chain_of_responsibility.filter.node_impl.filter;

import indi.zeroornull.pattern.chain_of_responsibility.filter.Request;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Response;
import indi.zeroornull.pattern.chain_of_responsibility.filter.node_impl.chain.FilterChain;


public class BFilter implements Filter {
    @Override
    public void doFilter(Request req, Response res, FilterChain filterChain) {
        System.out.println("BFilter");
        filterChain.doFilter(req, res);
    }
}
