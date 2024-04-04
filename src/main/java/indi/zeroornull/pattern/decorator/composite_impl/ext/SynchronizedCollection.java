package indi.zeroornull.pattern.decorator.composite_impl.ext;

import indi.zeroornull.pattern.decorator.collection.Collection;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SynchronizedCollection<E> {
    private final Collection<E> collection;
    private final Object mutex;

    public SynchronizedCollection(Collection<E> collection, Object mutex) {
        this.collection = collection;
        this.mutex = mutex;
    }
    
    public SynchronizedCollection(Collection<E> collection) {
        this.collection = collection;
        this.mutex = this;
    }
    
    public int size() {
        log.info("synchronized...");
        synchronized (mutex) {
            return collection.size();
        }
    }
    
    public E get(int index) {
        log.info("synchronized...");
        synchronized (mutex) {
            return collection.get(index);
        }
    }
    
    public void add(E e) {
        log.info("synchronized...");
        synchronized (mutex) {
            collection.add(e);
        }
    }
    
    public boolean remove(Object o) {
        log.info("synchronized...");
        synchronized (mutex) {
            return collection.remove(o);
        }
    }
    
    
}
