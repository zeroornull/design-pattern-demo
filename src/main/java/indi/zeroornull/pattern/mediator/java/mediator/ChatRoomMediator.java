package indi.zeroornull.pattern.mediator.java.mediator;

import indi.zeroornull.pattern.mediator.java.colleague.User;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ChatRoomMediator implements Mediator{
    private final List<User> users;

    public ChatRoomMediator() {
        users = new ArrayList<>();
    }
    
    public void addUser(User user) {
        users.add(user);
    }
    
    public void removeUser(User user) {
        log.info("移除用户：[" + user + "]");
        users.remove(user);
    }

    @Override
    public void sendMessage( User user,String message) {
        if (!users.contains(user)){
            throw new RuntimeException("您已被移出该群");
        }
        for (User u : users) {
            if (!u.equals(user)) {
                u.receiveMessage(message);
            }
        }
        log.info("--------------------------");
    }
}
