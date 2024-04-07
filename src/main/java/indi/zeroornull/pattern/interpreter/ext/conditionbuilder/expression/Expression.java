package indi.zeroornull.pattern.interpreter.ext.conditionbuilder.expression;

import indi.zeroornull.pattern.interpreter.ext.conditionbuilder.Context;

// 表达式抽象
public interface Expression {
    boolean evaluate(Context context);
}
