package main.nl.crack.trees.programs;

import java.util.Comparator;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 12/29/15.
 *
 * Program to insert a node into a bst tree
 */
public class BstInsert {
    public static <T> void insert(Node<T> root, T value,
                                  Comparator<T> comparator) {
        //validation
        if (root != null && comparator != null) {
            performInsert(root, value, comparator);
        }

    }

    private static <T> Node<T> performInsert(Node<T> node, T value, Comparator<T> comparator) {
        if (node == null) {
            return new Node<T>(value);
        }

        if (comparator.compare(value, node.getValue()) > 0) {
            node.setLeft(performInsert(node.getLeft(), value, comparator));
        } else {
            node.setRight(performInsert(node.getRight(), value, comparator));
        }
        return node;
    }
}
