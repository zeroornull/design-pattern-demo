package indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl.chain;

import indi.zeroornull.pattern.chain_of_responsibility.filter.Request;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Response;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Servlet;
import indi.zeroornull.pattern.chain_of_responsibility.filter.array_impl.filter.Filter;

public class FilterChain {
    private Servlet servlet;
    private Filter[] filters = new Filter[0];
    private int pos = 0;
    private int n = 0;
    
    public void doFilter(Request req, Response res) {
        if (pos < n) {
            Filter filter = filters[pos++];
            filter.doFilter(req,res,this);
        } else {
            servlet.service(req,res);
        }
    }
    
    public void addFilter(Filter filter) {
        for (Filter existingFilter : filters) {
            if (existingFilter == filter) {
                return;
            }
        }
        
        if (n == filters.length) {
            Filter[] newFilters = new Filter[n + 10];
            System.arraycopy(filters, 0, newFilters, 0, n);
            filters = newFilters;
        }
        
        filters[n++] = filter;
    }
    
    public void setServlet(Servlet servlet) {
        this.servlet = servlet;
    }
}
