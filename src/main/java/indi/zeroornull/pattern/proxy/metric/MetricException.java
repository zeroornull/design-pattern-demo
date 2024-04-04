package indi.zeroornull.pattern.proxy.metric;

// 打点异常
public class MetricException extends Exception {
    public MetricException(String message) {
        super(message);
    }
}
