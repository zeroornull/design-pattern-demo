package indi.zeroornull.pattern.visitor.expression_visitor.expression;

import indi.zeroornull.pattern.visitor.expression_visitor.visitor.Visitor;

import lombok.Getter;

public class AddExpression implements Expression {
    // 提供getter，这样Visitor才能访问
    @Getter
    private final Expression left;
    @Getter
    private final Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}