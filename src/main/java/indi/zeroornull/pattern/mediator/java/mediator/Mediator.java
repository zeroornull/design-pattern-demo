package indi.zeroornull.pattern.mediator.java.mediator;

import indi.zeroornull.pattern.mediator.java.colleague.User;

public interface Mediator {
    void sendMessage(User sender, String message);
}
