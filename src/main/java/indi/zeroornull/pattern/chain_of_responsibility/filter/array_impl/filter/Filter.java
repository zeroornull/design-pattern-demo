package indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl.filter;

import indi.zeroornull.pattern.chain_of_responsibility.filter.Request;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Response;
import indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl.chain.FilterChain;


public interface Filter {
    void doFilter(Request req, Response res, FilterChain filterChain);
}
