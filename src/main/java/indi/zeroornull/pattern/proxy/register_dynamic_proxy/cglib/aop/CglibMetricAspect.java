package indi.zeroornull.pattern.proxy.register_dynamic_proxy.cglib.aop;

import java.lang.reflect.Method;
import java.util.Map;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import indi.zeroornull.pattern.proxy.metric.Metric;
import indi.zeroornull.pattern.proxy.metric.MetricTagEnum;
import indi.zeroornull.pattern.proxy.metric.MetricTagSetter;
import indi.zeroornull.pattern.proxy.metric.MetricUtil2;

public class CglibMetricAspect implements MethodInterceptor {

    private final Object target;

    public CglibMetricAspect(Object target) {
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    public static <T> T createProxy(T target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new CglibMetricAspect(target));
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Metric metric = method.getAnnotation(Metric.class);
        if (metric == null) {
            return method.invoke(target, args);
        }
        return MetricUtil2.metric(() -> method.invoke(target, args), new MetricTagSetter<Object>() {
            @Override
            public void apply(Object result, Map<MetricTagEnum, String> initialTagMap) {
                initialTagMap.put(MetricTagEnum.BIZ_TAG, metric.bizTag());
                initialTagMap.put(MetricTagEnum.BIZ_SUB_TAG, metric.bizSubTag());
            }
        });
    }
}