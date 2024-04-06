package indi.zeroornull.pattern.visitor.expression;

import indi.zeroornull.pattern.strategy.classical.Add;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArithmeticTest {
    public static void main(String[] args) {
        // 1+2-3
        Expression expression = new SubtractExpression(
                new AddExpression(new NumberExpression(1), new NumberExpression(2)),
                new NumberExpression(3)
        );
        int result= expression.interpret();
        log.info(String.valueOf(result));
        
    }
}
