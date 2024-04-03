package indi.zeroornull.pattern.chain_of_responsibility.filter.bad_impl.filter;

import indi.zeroornull.pattern.chain_of_responsibility.filter.Request;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Response;

public interface Filter {
    boolean doFilter(Request req, Response res);
    
    void setNext(Filter filter);
    
    Filter getNext();
    
}
