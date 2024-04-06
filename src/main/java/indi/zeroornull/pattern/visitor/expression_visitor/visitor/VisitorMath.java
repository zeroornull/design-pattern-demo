package indi.zeroornull.pattern.visitor.expression_visitor.visitor;

import indi.zeroornull.pattern.visitor.expression_visitor.expression.AddExpression;
import indi.zeroornull.pattern.visitor.expression_visitor.expression.NumberExpression;
import indi.zeroornull.pattern.visitor.expression_visitor.expression.SubtractExpression;

public class VisitorMath implements Visitor {

    private final StringBuilder sb = new StringBuilder();

    public String getResult() {
        return sb.toString();
    }

    @Override
    public void visit(NumberExpression expression) {
        sb.append(expression.interpret());
    }

    @Override
    public void visit(AddExpression expression) {
        expression.getLeft().accept(this);
        sb.append("+");
        expression.getRight().accept(this);
    }

    @Override
    public void visit(SubtractExpression expression) {
        expression.getLeft().accept(this);
        sb.append("-");
        expression.getRight().accept(this);
    }
}
