package indi.zeroornull.pattern.decorator.decorator_impl.ext;

import indi.zeroornull.pattern.decorator.collection.Collection;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheckedCollection<E> implements Collection<E> {

    private final Collection<E> collection;
    private final Class<E> type;

    public CheckedCollection(Collection<E> collection, Class<E> type) {
        this.collection = collection;
        this.type = type;
    }

    @Override
    public int size() {
        return collection.size();
    }

    @Override
    public E get(int index) {
        return collection.get(index);
    }

    @Override
    public void add(E e) {
        collection.add(typeCheck(e));
    }

    @Override
    public boolean remove(Object o) {
        return collection.remove(o);
    }

    @SuppressWarnings("unchecked")
    private E typeCheck(Object o) {
        log.info("typeCheck...");
        if (o != null && !type.isInstance(o))
            throw new ClassCastException(badElementMsg(o));
        return (E)o;
    }

    private String badElementMsg(Object o) {
        return "Attempt to insert " + o.getClass() + " element into collection with element type " + type;
    }

}
