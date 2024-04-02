package indi.zeroornull.pattern.iterator.v1.container;

import indi.zeroornull.pattern.iterator.v1.iterator.Iterable;
import indi.zeroornull.pattern.iterator.v1.iterator.Iterator;

import java.util.Stack;

public class BinarySearchTree<E extends Comparable<E>> implements Iterable<E> {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(E data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, E data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public boolean search(E data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, E data) {
        if (root == null) {
            return false;
        }
        if (data.compareTo(root.data) == 0) {
            return true;
        }
        if (data.compareTo(root.data) < 0) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

    private class Node {
        E data;
        Node left;
        Node right;

        public Node(E data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new InOrderIterator(root);
    }

    private class InOrderIterator implements Iterator<E> {
        private final Stack<Node> stack;

        public InOrderIterator(Node root) {
            stack = new Stack<>();
            pushLeft(root);
        }

        private void pushLeft(Node node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public E next() {
            Node current = stack.pop();
            pushLeft(current.right);
            return current.data;
        }
    }
}
