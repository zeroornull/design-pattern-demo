package indi.zeroornull.pattern.visitor.expression_visitor.expression;

import indi.zeroornull.pattern.visitor.expression_visitor.visitor.Visitor;

public class NumberExpression implements Expression {
    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}