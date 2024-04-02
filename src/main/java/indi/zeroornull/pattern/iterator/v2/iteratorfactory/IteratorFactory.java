package indi.zeroornull.pattern.iterator.v2.iteratorfactory;


import indi.zeroornull.pattern.iterator.v2.container.Node;
import indi.zeroornull.pattern.iterator.v2.iterator.Iterator;

public interface IteratorFactory<E> {
    Iterator<E> createIterator(Node<E> root);
}