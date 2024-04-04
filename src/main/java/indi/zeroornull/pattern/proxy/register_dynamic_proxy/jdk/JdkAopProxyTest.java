package indi.zeroornull.pattern.proxy.register_dynamic_proxy.jdk;

import indi.zeroornull.pattern.proxy.register_dynamic_proxy.jdk.aop.ApplicationContext;
import indi.zeroornull.pattern.proxy.register_dynamic_proxy.jdk.target.IUserService;

public class JdkAopProxyTest {
    public static void main(String[] args) {
        String beanPath = "indi.zeroornull.pattern.proxy.register_dynamic_proxy.jdk.target.UserService";

        ApplicationContext applicationContext = new ApplicationContext();
        IUserService userService = (IUserService)applicationContext.getBean(beanPath);
        userService.register("zeroornull", "18888888888", "male");
    }
}
