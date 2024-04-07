package indi.zeroornull.pattern.interpreter.ext.conditionlazybuilder.expression;

import indi.zeroornull.pattern.interpreter.ext.conditionlazybuilder.Context;

public interface Expression {
    boolean evaluate(Context context);
}
