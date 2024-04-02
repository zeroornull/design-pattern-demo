package indi.zeroornull.pattern.iterator.v2.iteratorfactory;

import indi.zeroornull.pattern.iterator.v2.container.Node;
import indi.zeroornull.pattern.iterator.v2.iterator.InOrderIterator;
import indi.zeroornull.pattern.iterator.v2.iterator.Iterator;

public class InOrderIteratorFactory<E extends Comparable<E>> implements IteratorFactory<E> {
    @Override
    public Iterator<E> createIterator(Node<E> root) {
        return new InOrderIterator<E>(root);
    }
}
