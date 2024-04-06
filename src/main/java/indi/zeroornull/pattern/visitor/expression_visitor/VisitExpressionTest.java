package indi.zeroornull.pattern.visitor.expression_visitor;

import indi.zeroornull.pattern.visitor.expression_visitor.expression.AddExpression;
import indi.zeroornull.pattern.visitor.expression_visitor.expression.Expression;
import indi.zeroornull.pattern.visitor.expression_visitor.expression.NumberExpression;
import indi.zeroornull.pattern.visitor.expression_visitor.expression.SubtractExpression;
import indi.zeroornull.pattern.visitor.expression_visitor.visitor.VisitorChinese;
import indi.zeroornull.pattern.visitor.expression_visitor.visitor.VisitorJapanese;
import indi.zeroornull.pattern.visitor.expression_visitor.visitor.VisitorMath;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VisitExpressionTest {

    public static void main(String[] args) {
        Expression expression = new SubtractExpression(
            new AddExpression(new NumberExpression(1), new NumberExpression(2)), new NumberExpression(3));
        VisitorMath visitorMath = new VisitorMath();
        expression.accept(visitorMath);
        log.info("visitorMath: " + visitorMath.getResult());

        VisitorChinese visitorChinese = new VisitorChinese();
        expression.accept(visitorChinese);
        log.info("visitorChinese: " + visitorChinese.getResult());

        VisitorJapanese visitorJapanese = new VisitorJapanese();
        expression.accept(visitorJapanese);
        log.info("visitorJapanese: " + visitorJapanese.getResult());
    }

}
