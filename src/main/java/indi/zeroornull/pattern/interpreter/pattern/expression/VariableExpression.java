package indi.zeroornull.pattern.interpreter.pattern.expression;

import indi.zeroornull.pattern.interpreter.pattern.Context;

public class VariableExpression implements Expression {
    
    private final char variable;
    
    public VariableExpression(char variable) {
        this.variable = variable;
    }
    
    @Override
    public int interpret(Context context) {
        return context.getValue(variable);
    }
}
