package indi.zeroornull.pattern.interpreter.ext.conditionlazybuilder.expression;

import indi.zeroornull.pattern.interpreter.ext.conditionlazybuilder.Context;

import java.util.List;

public class OrExpression implements Expression{

    private final List<Expression> expressions;

    public OrExpression(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public boolean evaluate(Context context) {
        for (Expression expression : expressions) {
            if (expression.evaluate(context)) {
                return true;
            }
        }
        return false;
    }
}
