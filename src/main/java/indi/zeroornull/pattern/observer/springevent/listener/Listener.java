package indi.zeroornull.pattern.observer.springevent.listener;

import indi.zeroornull.pattern.observer.springevent.event.Event;

public interface Listener <E extends Event> {
    /**
     * 事件监听器
     * @param event 事件
     */
    void onApplicationEvent(E event);

    /**
     * 监听器是否匹配
     */
    boolean supportsEventType(Event event);
}
