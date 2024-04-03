package indi.zeroornull.pattern.chain_of_responsibility.filter.bad_impl.chain;

import indi.zeroornull.pattern.chain_of_responsibility.filter.Request;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Response;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Servlet;
import indi.zeroornull.pattern.chain_of_responsibility.filter.bad_impl.filter.Filter;

public class FilterChain {
    private Servlet servlet;
    private Filter firstFilter;
    
    public void doFilter(Request req, Response res) {
        if (firstFilter != null) {
            Filter filter = firstFilter;
            firstFilter = firstFilter.getNext();
            filter.doFilter(req,res);
        } else {
            servlet.service(req,res);
        }
    }
    
    public void addFilter(Filter filter) {
        if (firstFilter == null) {
            firstFilter = filter;
        } else {
            Filter currentFilter = firstFilter;
            while (currentFilter.getNext() != null) {
                currentFilter = currentFilter.getNext();
            }
            currentFilter.setNext(filter);
        }
    }
    
    public void setServlet(Servlet servlet) {
        this.servlet = servlet;
    }
}
