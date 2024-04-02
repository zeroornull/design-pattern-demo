package indi.zeroornull.pattern.iterator.v1;

import indi.zeroornull.pattern.iterator.v1.container.ArrayList;
import indi.zeroornull.pattern.iterator.v1.container.BinarySearchTree;
import indi.zeroornull.pattern.iterator.v1.container.LinkedList;
import indi.zeroornull.pattern.iterator.v1.iterator.Iterator;
import lombok.extern.slf4j.Slf4j;

/**
 * 内部类实现迭代器
 */
@Slf4j
public class IteratorV1Test {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        log.info(search(arrayList.iterator(), "a") + "");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        log.info(search(linkedList.iterator(), "b") + "");

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(8);
        binarySearchTree.insert(4);
        binarySearchTree.insert(2);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);
        log.info(search(binarySearchTree.iterator(), 8) + "");
    }

    public static boolean search(Iterator<?> iterator, Object targetItem) {
        while (iterator.hasNext()) {
            if (iterator.next().equals(targetItem)) {
                return true;
            }
        }
        return false;
    }

}
