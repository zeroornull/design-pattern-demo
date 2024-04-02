package indi.zeroornull.pattern.observer.eventbus.listener;

import indi.zeroornull.pattern.observer.eventbus.event.MyEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyEventListener implements EventListener<MyEvent>{
    @Override
    public void onEvent(MyEvent event) {
      log.info("Processing event: " + event.getMessage());  
    }
}
