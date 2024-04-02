package indi.zeroornull.pattern.observer.pattern;

import indi.zeroornull.pattern.observer.pattern.observer.ErpService;
import indi.zeroornull.pattern.observer.pattern.observer.SmsService;

public class OrderServiceClient {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.addObserver(new SmsService());
        orderService.addObserver(new ErpService());
        // orderService.addObserver(new XxxService()); // 修改点：新增XxxService

        orderService.order("iPhone 15 pro");
    }
}
