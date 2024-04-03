package indi.zeroornull.pattern.decorator.inheritance_impl;

import indi.zeroornull.pattern.decorator.inheritance_impl.ext.SynchronizedArrayList;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InheritanceExtendsTest {
    public static void main(String[] args) {
        // SynchronizedArrayList继承ArrayList，对add方法加锁
        SynchronizedArrayList<String> synchronizedArrayList = new SynchronizedArrayList<>();
        synchronizedArrayList.add("zeroornull");
        synchronizedArrayList.add("zeroornull1");
        log.info(String.valueOf(synchronizedArrayList.size()));
    }
}
