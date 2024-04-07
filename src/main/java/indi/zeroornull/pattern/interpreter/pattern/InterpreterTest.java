package indi.zeroornull.pattern.interpreter.pattern;

import indi.zeroornull.pattern.interpreter.pattern.expression.Expression;
import indi.zeroornull.pattern.interpreter.pattern.expression.MultiplicationExpression;
import indi.zeroornull.pattern.interpreter.pattern.expression.SubtractionExpression;
import indi.zeroornull.pattern.interpreter.pattern.expression.VariableExpression;

public class InterpreterTest {
    public static void main(String[] args) {
        // 假设这是从数据库获取的点数，我们把它们存入Context中
        Context context = new Context();
        context.setValue('a', 3);
        context.setValue('b', 8);
        context.setValue('c', 8);
        context.setValue('d', 9);

        // 构建表达式(d-c)*b*a
        Expression expression = new MultiplicationExpression(new MultiplicationExpression(
            new SubtractionExpression(new VariableExpression('d'), new VariableExpression('c')),
            new VariableExpression('b')), new VariableExpression('a'));
        System.out.println(expression.interpret(context));

    }
}
