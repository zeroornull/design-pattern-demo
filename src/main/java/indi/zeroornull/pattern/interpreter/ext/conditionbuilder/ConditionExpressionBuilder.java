package indi.zeroornull.pattern.interpreter.ext.conditionbuilder;

import indi.zeroornull.pattern.interpreter.ext.conditionbuilder.expression.AndExpression;
import indi.zeroornull.pattern.interpreter.ext.conditionbuilder.expression.EqualsExpression;
import indi.zeroornull.pattern.interpreter.ext.conditionbuilder.expression.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConditionExpressionBuilder {
    private final List<Expression> expressions = new ArrayList<>();
    
    private ConditionExpressionBuilder() {
    }
    
    public static ConditionExpressionBuilder builder() {
        return new ConditionExpressionBuilder();
    }
    
    public ConditionExpressionBuilder eq(String key,String value){
        expressions.add(new EqualsExpression(key,value));
        return this;
    }
    
    public ConditionExpressionBuilder and(Consumer<ConditionExpressionBuilder> consumer){
        ConditionExpressionBuilder builder = new ConditionExpressionBuilder();
        consumer.accept(builder);
        expressions.add(new AndExpression(builder.expressions));
        return this;
    }
    
    public ConditionExpressionBuilder or(Consumer<ConditionExpressionBuilder> consumer){
        ConditionExpressionBuilder builder = new ConditionExpressionBuilder();
        consumer.accept(builder);
        expressions.add(new AndExpression(builder.expressions));
        return this;
    }
    
    public Expression build(){
        return new AndExpression(expressions);
    }
}
