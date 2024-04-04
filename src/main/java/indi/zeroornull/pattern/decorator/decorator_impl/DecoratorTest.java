package indi.zeroornull.pattern.decorator.decorator_impl;

import indi.zeroornull.pattern.decorator.collection.ArrayList;
import indi.zeroornull.pattern.decorator.collection.List;
import indi.zeroornull.pattern.decorator.decorator_impl.ext.CheckedCollection;
import indi.zeroornull.pattern.decorator.decorator_impl.ext.SynchronizedCollection;
import indi.zeroornull.pattern.decorator.decorator_impl.ext.UnmodifiableCollection;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zeroornull");

        log.info("=======叠加同步能力========");

        SynchronizedCollection<String> synchronizedList = new SynchronizedCollection<>(list);
        synchronizedList.add("zeroornull1");

        log.info("=======叠加类型校验能力========");

        CheckedCollection<String> checkedList = new CheckedCollection<>(synchronizedList, String.class);
        checkedList.add("zeroornull2");

        log.info("=======叠加不可变能力========");
        // 因为后面叠加的能力在最外层被调用，所以这里直接抛异常了
        UnmodifiableCollection<String> unmodifiableList = new UnmodifiableCollection<>(checkedList);
        unmodifiableList.add("zeroornull3");
    }

}
