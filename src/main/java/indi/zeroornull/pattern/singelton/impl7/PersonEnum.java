package indi.zeroornull.pattern.singelton.impl7;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum PersonEnum {
    STUDENT("孙悟饭", 18) {
        @Override
        public void jump() {
            log.info("孙悟饭跳跳");
        }
    };

    private final String name;
    private final Integer age;

    PersonEnum(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 抽象方法
     */
    public abstract void jump();
}
