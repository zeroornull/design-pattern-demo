package indi.zeroornull.pattern.visitor.expression_visitor.expression;

import indi.zeroornull.pattern.visitor.expression_visitor.visitor.Visitor;

public interface Expression {
    int interpret();
    // 接收visitor对象，允许访问对象结构
    void accept(Visitor visitor);
}
