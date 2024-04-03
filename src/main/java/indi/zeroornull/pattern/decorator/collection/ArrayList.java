package indi.zeroornull.pattern.decorator.collection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArrayList<E> implements List<E> {

    private int size;

    public ArrayList() {
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
    public void add(E e) {
        log.info("增加了一个元素:" + e);
        size++;
    }

    @Override
    public boolean remove(Object o) {
        log.info("删除了一个元素:" + o);
        size--;
        return true;
    }
}
