package indi.zeroornull.pattern.proxy.jdk_proxy_demo;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Slf4j
public class JdkProxyTest {
    public static void main(String[] args) {
        // 目标对象
        Calculator target = new CalculatorImpl();
        // 获取代理对象
        Calculator proxyCalculator = (Calculator)Proxy.newProxyInstance(Calculator.class.getClassLoader(),
            new Class[] {Calculator.class}, new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    log.info("before " + method.getName());
                    Object result = method.invoke(target, args);
                    log.info("after " + method.getName());
                    return result;
                }
            });
        // log.info(proxyCalculator.getClass().getSimpleName());
        log.info("执行结果：" + proxyCalculator.add(1, 2));
    }

    // 定义一个计算器接口
    interface Calculator {
        int add(int a, int b);
    }

    // 实现计算器接口
    static class CalculatorImpl implements Calculator {
        @Override
        public int add(int a, int b) {
            log.info("invoke add(a=" + a + " b=" + b + ")");
            return a + b;
        }
    }

}
