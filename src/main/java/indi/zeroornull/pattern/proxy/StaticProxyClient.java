package indi.zeroornull.pattern.proxy;

import indi.zeroornull.pattern.proxy.register_static_proxy.proxy.ProxyUserService;
import indi.zeroornull.pattern.proxy.register_static_proxy.target.UserService;

public class StaticProxyClient {
    public static void main(String[] args) {
        ProxyUserService proxyUserService = new ProxyUserService(new UserService());
        proxyUserService.register("zeroornull", "18888888888", "male");
    }
}
