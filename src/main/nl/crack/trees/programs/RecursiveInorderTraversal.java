package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 1/7/16.
 * Recursive in order traversal. Left , Head, Right
 */
public class RecursiveInorderTraversal<T> {

    public static<T> void inOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        System.out.println(node.getValue());
        inOrder(node.getRight());
    }
}
