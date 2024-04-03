package indi.zeroornull.pattern.chain_of_responsibility.filter.bad_impl.filter;

import indi.zeroornull.pattern.chain_of_responsibility.filter.Request;
import indi.zeroornull.pattern.chain_of_responsibility.filter.Response;

public abstract class AbstractFilter implements Filter {

    private Filter nextFilter;

    @Override
    public boolean doFilter(Request req, Response res) {
        return this.judge(req, res) ? this.next(req, res) : this.stop();
    }

    protected abstract boolean judge(Request req, Response res);

    private boolean next(Request req, Response res) {
        return nextFilter != null && nextFilter.doFilter(req, res);
    }

    private boolean stop() {
        return false;
    }

    @Override
    public void setNext(Filter filter) {
        this.nextFilter = filter;
    }

    @Override
    public Filter getNext() {
        return this.nextFilter;
    }
}
