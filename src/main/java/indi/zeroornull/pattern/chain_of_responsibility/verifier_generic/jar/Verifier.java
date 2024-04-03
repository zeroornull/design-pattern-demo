package indi.zeroornull.pattern.chain_of_responsibility.verifier_generic.jar;

public interface Verifier<I, O> {

    O verify(I request);

}
