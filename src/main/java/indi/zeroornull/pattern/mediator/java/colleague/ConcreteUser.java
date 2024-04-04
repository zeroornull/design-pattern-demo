package indi.zeroornull.pattern.mediator.java.colleague;

import indi.zeroornull.pattern.mediator.java.mediator.ChatRoomMediator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteUser implements User {

    private String name;
    private ChatRoomMediator mediator;

    public ConcreteUser(String name, ChatRoomMediator mediator) {

        this.name = name;
        this.mediator = mediator;
        mediator.addUser(this);
    }

    @Override
    public void sendMessage(String message) {
        log.info(name + "发送给聊天室： " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        log.info(name + "收到来自聊天室的消息： " + message);
    }

    @Override
    public String toString() {
        return name;
    }
}
