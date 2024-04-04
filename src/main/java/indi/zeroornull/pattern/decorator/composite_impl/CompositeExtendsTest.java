package indi.zeroornull.pattern.decorator.composite_impl;

import indi.zeroornull.pattern.decorator.collection.ArrayList;
import indi.zeroornull.pattern.decorator.composite_impl.ext.SynchronizedCollection;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompositeExtendsTest {
    public static void main(String[] args) {
        // 组合一个ArrayList对象，对add方法加锁
        ArrayList<String> list = new ArrayList<>();
        SynchronizedCollection<String> wrapperCollection = new SynchronizedCollection<>(list);
        wrapperCollection.add("zeroornull");
        wrapperCollection.add("zeroornull2");
        log.info(String.valueOf(wrapperCollection.size()));
    }
}
