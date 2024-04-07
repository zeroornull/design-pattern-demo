package indi.zeroornull.pattern.interpreter.ext.sqlbuilder;

@FunctionalInterface
public interface Condition {
    void apply(SqlExpressionBuilder builder);
}
