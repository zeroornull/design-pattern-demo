package indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl;

import indi.zeroornull.pattern.chain_of_responsibility.filter.Request;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Response;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Servlet;
import indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl.chain.FilterChain;
import indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl.filter.EncodeFilter;
import indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl.filter.LogFilter;

public class ArrayFilterChainTest {

    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        chain.addFilter(new LogFilter());
        chain.addFilter(new EncodeFilter());
        chain.setServlet(new Servlet());

        // 模拟一个请求，要经过Filter
        chain.doFilter(new Request(), new Response());
    }
}
