package indi.zeroornull.pattern.observer.eventbus.event;

import lombok.Getter;

public class MyEvent {
    @Getter
    private final String message;
    
    public MyEvent(String message) {
        this.message = message;
    }
    
}
