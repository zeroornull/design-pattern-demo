package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.verifier;

import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.support.Context;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor2.support.Result;

public interface OrderConvertVerifier {
    Result verify(Context context);
}
