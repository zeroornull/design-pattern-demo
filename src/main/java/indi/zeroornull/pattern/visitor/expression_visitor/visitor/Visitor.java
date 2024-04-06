package indi.zeroornull.pattern.visitor.expression_visitor.visitor;

import indi.zeroornull.pattern.visitor.expression_visitor.expression.AddExpression;
import indi.zeroornull.pattern.visitor.expression_visitor.expression.NumberExpression;
import indi.zeroornull.pattern.visitor.expression_visitor.expression.SubtractExpression;

public interface Visitor {
    void visit(NumberExpression expression);

    void visit(AddExpression expression);

    void visit(SubtractExpression expression);
}
