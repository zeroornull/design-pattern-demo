package indi.zeroornull.pattern.visitor.double_dispatch.visitor;

import indi.zeroornull.pattern.visitor.double_dispatch.inheritance.Father;
import indi.zeroornull.pattern.visitor.double_dispatch.inheritance.Son;

public interface Printer {
    void print(Father father);

    void print(Son son);
}
