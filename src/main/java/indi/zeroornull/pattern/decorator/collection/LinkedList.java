package indi.zeroornull.pattern.decorator.collection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedList<E> implements List<E> {
    
    private int size;

    public LinkedList() {
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void add(E element) {
        log.info("增加了一个元素：" + element);
        size++;
    }

    @Override
    public boolean remove(Object obj) {
        log.info("移除了元素：" + obj);
        size--;
        return true;
    }
}
