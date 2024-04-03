package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.support;

import lombok.Data;

// 请求上下文，包括入参和过程变量
@Data
public class Context {
    private OrderConvertRequest request;
}
