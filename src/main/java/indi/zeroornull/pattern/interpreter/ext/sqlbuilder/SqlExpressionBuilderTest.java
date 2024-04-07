package indi.zeroornull.pattern.interpreter.ext.sqlbuilder;

public class SqlExpressionBuilderTest {
    public static void main(String[] args) {
        String sql = SqlExpression.builder().eq("name", "zeroornull").eq("age", "27").and(x -> {
            x.eq("weight", "80").or().eq("height", "180").or().eq("id", "10086");
        }).or(x -> {
            x.eq("a", "1").eq("b", "2");
        }).build();
        // name = zeroornull' AND age = 27' AND ( weight = 80' OR height = 180' OR id = 10086' ) OR ( a = 1' AND b = 2'
        // )
        System.out.println(sql);
    }
}
