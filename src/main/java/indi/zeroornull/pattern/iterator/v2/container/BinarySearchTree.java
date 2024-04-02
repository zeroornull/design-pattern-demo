package indi.zeroornull.pattern.iterator.v2.container;

import indi.zeroornull.pattern.iterator.v2.iterator.Iterable;
import indi.zeroornull.pattern.iterator.v2.iterator.Iterator;
import indi.zeroornull.pattern.iterator.v2.iteratorfactory.IteratorFactory;

/**
 * 通过工厂方法模式将迭代器抽取出去，自由组合
 */
public class BinarySearchTree<E extends Comparable<E>> implements Iterable<E> {
    private Node<E> root;
    private final IteratorFactory<E> iteratorFactory;

    public BinarySearchTree(IteratorFactory<E> iteratorFactory) {
        root = null;
        this.iteratorFactory = iteratorFactory;
    }

    public void insert(E data) {
        // 插入新元素，返回根节点
        root = insertRec(root, data);
    }

    private Node<E> insertRec(Node<E> root, E data) {
        if (root == null) {
            // 递归的结束条件：到了某个分支末尾，构建节点并插入
            root = new Node<>(data);
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            // 递归：数据比当前节点小，往左继续比较插入
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            // 递归：数据比当前节点大，往右继续比较插入
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public boolean search(E data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node<E> root, E data) {
        if (root == null) {
            return false;
        }
        if (data.compareTo(root.data) == 0) {
            // 递归结束条件：找到相等的节点
            return true;
        }

        if (data.compareTo(root.data) < 0) {
            // 递归：数据比当前节点小，往左继续比较
            return searchRec(root.left, data);
        } else {
            // 递归：数据比当前节点大，往右继续比较
            return searchRec(root.right, data);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return iteratorFactory.createIterator(root);
    }
}
