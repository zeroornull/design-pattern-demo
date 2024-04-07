package indi.zeroornull.pattern.interpreter.ext.conditionbuilder;

import indi.zeroornull.pattern.interpreter.ext.conditionbuilder.expression.Expression;

public class ConditionExpressionBuilderTest {
    public static void main(String[] args) {
        // 构建表达式
        Expression expression = ConditionExpressionBuilder.builder()
                .eq("name","zeroornull")
                .eq("age","27")
                .or(x->x.eq("weight","80").eq("height","190"))
                .build();
        // 构建数据
        Context context = new Context();
        context.setVariable("name","zeroornull");
        context.setVariable("age","27");
        context.setVariable("weight","80");
        context.setVariable("height","180");

        // 用表达式校验数据
        System.out.println(expression.evaluate(context));
    }
}
