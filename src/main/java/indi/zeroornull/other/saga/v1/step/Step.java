package indi.zeroornull.other.saga.v1.step;

import indi.zeroornull.other.saga.v1.Context;

public interface Step {
    void execute(Context context);

    void rollback(Context context);
}
