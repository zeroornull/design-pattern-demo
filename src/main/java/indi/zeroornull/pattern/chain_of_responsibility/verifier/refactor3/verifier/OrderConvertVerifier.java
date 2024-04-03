package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.verifier;

import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.support.Context;
import indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor3.support.Result;

public interface OrderConvertVerifier {

    Result verify(Context context);

}