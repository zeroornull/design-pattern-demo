package indi.zeroornull.pattern.observer.eventbus.listener;

public interface EventListener <T>{
    void onEvent(T event);
}
