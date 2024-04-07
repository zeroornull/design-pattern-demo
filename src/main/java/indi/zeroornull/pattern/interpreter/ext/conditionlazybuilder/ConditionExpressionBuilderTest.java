package indi.zeroornull.pattern.interpreter.ext.conditionlazybuilder;

import indi.zeroornull.pattern.interpreter.ext.conditionlazybuilder.expression.Expression;

public class ConditionExpressionBuilderTest {

    public static void main(String[] args) {
        //
        Expression expression = ConditionExpressionBuilder.builder().eq("name", "zeroornull").eq("age", "27")
            .or(x -> x.eq("weight", "80").eq("height", "190")).build();

        UserService userService = new UserService();
        Context context = new Context().value("name", "zeroornull").lazyValue("age", userService::getUserAge)
            .value("weight", "80").value("height", "180");
        System.out.println(expression.evaluate(context));
    }

    static class UserService {
        public String getUserAge() {
            System.out.println("UserService#getUserAge被调用了");
            return "18";
        }
    }
}
