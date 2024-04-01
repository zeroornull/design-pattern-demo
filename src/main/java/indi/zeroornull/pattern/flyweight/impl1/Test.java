package indi.zeroornull.pattern.flyweight.impl1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(127);
        Integer b = Integer.valueOf(127);
        log.info(String.valueOf(a == b)); // true, 返回的是缓存池中同一对象

        Integer c = Integer.valueOf(128);
        Integer d = Integer.valueOf(128);
        log.info(String.valueOf(c == d)); // false, 不在缓存池中（-128~127），所以分别new了两个Integer
    }
}
