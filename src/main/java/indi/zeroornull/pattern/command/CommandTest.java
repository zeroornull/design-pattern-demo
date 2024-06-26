package indi.zeroornull.pattern.command;

import indi.zeroornull.pattern.command.command.Command;
import indi.zeroornull.pattern.command.command.ConcreteCommandA;
import indi.zeroornull.pattern.command.invoker.Invoker;
import indi.zeroornull.pattern.command.receiver.ReceiverA;

public class CommandTest {

    public static void main(String[] args) {
        Command command = buildCommand();
        Invoker invoker = new Invoker(command);
        invoker.request();
    }

    /**
     * 如果有多个Receiver，可以通过编写对应的ConcreteCommand来处理
     * 同时Invoker保持稳定，不受影响
     */
    private static Command buildCommand() {
        ReceiverA receiver = new ReceiverA();
        return new ConcreteCommandA(receiver);
    }

}
