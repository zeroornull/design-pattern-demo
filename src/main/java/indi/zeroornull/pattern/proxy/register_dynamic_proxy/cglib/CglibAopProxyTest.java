package indi.zeroornull.pattern.proxy.register_dynamic_proxy.cglib;

import indi.zeroornull.pattern.proxy.register_dynamic_proxy.cglib.aop.ApplicationContext;
import indi.zeroornull.pattern.proxy.register_dynamic_proxy.cglib.target.UserService;

public class CglibAopProxyTest {
    public static void main(String[] args) {
        String beanPath = "indi.zeroornull.pattern.proxy.register_dynamic_proxy.cglib.target.UserService";

        ApplicationContext applicationContext = new ApplicationContext();
        UserService userService = (UserService) applicationContext.getBean(beanPath);// cglib并非基于接口，这里如果强转IService会报错
        userService.register("zeroornull", "18888888888", "male");
    }
}
