package indi.zeroornull.pattern.proxy.metric;

import java.util.Map;

public interface MetricTagSetter<T> {
    
    /**
     * 设置tag
     *
     * @param result        业务方法执行结果
     * @param initialTagMap 初始化的tagMap，可以根据业务场景追加tag
     */
    void apply(T result, Map<MetricTagEnum, String> initialTagMap);
}
