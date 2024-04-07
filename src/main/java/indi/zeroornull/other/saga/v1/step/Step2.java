package indi.zeroornull.other.saga.v1.step;

import indi.zeroornull.other.saga.v1.Context;

public class Step2 implements Step{
    @Override
    public void execute(Context context) {
        System.out.println("Step 2 executed");
    }

    @Override
    public void rollback(Context context) {
        System.out.println("Step 2 rolled back");
    }
}
