package indi.zeroornull.pattern.observer.pattern;

import indi.zeroornull.pattern.observer.pattern.observer.Observer;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class OrderService {

    // -------- 观察者模式相关代码 --------
    private final List<Observer> observers = new ArrayList<>();
    
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
    
    // -------- 下单相关业务代码 --------
    
    public void order(String product){
        // 下单操作
        int orderNumber = 1000;
        log.info("下单成功, 订单号:{}", orderNumber);
        // 通知所有观察者
        this.notifyObservers(product);
    }
    
    private void notifyObservers(String product){
        for (Observer observer : observers) {
            observer.update("18888888888", product);
        }
    }
}
