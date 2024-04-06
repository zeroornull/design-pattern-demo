package indi.zeroornull.pattern.visitor.expression_print;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintExpressionTest {

    public static void main(String[] args) {
        Expression expression = new SubtractExpression(
                new AddExpression(new NumberExpression(1), new NumberExpression(2)),
                new NumberExpression(3)
        );

        String print = expression.print();
        log.info(print); // 打印：1+2-3
    }
}
