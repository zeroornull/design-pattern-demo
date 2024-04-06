package indi.zeroornull.pattern.visitor.expression_visitor.visitor;

import indi.zeroornull.pattern.visitor.expression_visitor.expression.AddExpression;
import indi.zeroornull.pattern.visitor.expression_visitor.expression.NumberExpression;
import indi.zeroornull.pattern.visitor.expression_visitor.expression.SubtractExpression;

public class VisitorChinese implements Visitor {

    private final StringBuilder sb = new StringBuilder();

    public String getResult() {
        return sb.toString();
    }

    @Override
    public void visit(NumberExpression expression) {
        int num = expression.interpret();
        String[] chineseDigits = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        char[] digits = String.valueOf(num).toCharArray();
        for (char digit : digits) {
            sb.append(chineseDigits[Character.getNumericValue(digit)]);
        }
    }

    @Override
    public void visit(AddExpression expression) {
        expression.getLeft().accept(this);
        sb.append("加");
        expression.getRight().accept(this);
    }

    @Override
    public void visit(SubtractExpression expression) {
        expression.getLeft().accept(this);
        sb.append("减");
        expression.getRight().accept(this);
    }
}
