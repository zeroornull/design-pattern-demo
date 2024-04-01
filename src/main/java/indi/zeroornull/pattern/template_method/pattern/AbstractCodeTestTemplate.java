package indi.zeroornull.pattern.template_method.pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractCodeTestTemplate {

    // 模板方法：算法骨架
    public final void templateMethod() {
        long start = System.currentTimeMillis();

        // 抽象方法：差异的部分，下推到子类实现
        executeCode();

        long end = System.currentTimeMillis();
        log.info("总耗时:" + (end - start));
    }

    protected abstract void executeCode();

}
