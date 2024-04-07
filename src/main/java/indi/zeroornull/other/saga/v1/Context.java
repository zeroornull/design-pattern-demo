package indi.zeroornull.other.saga.v1;

import indi.zeroornull.other.saga.v1.step.Step;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private final List<Step> steps = new ArrayList<>();
    
    public void addStep(Step step) {
        steps.add(step);
    }
    
    public void execute() {
        for (Step step : steps) {
            try {
                step.execute(this);
            } catch (Exception e) {
                // 回滚
                rollback();
                throw e;
            }
        }
    }
    
    private void rollback() {
        for (int i = steps.size() - 1; i >= 0; i--) {
            steps.get(i).rollback(this);
        }
    }
    
}
