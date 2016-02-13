package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata on 2/9/16.
 * Preorder traversal head, left, right
 */
public class RecursivePreorderTraversal<T> {

    public static<T> void preorder(Node<T> node) {
        if(node == null) {
            return;
        }
        if (node.getValue() != null) {
            System.out.println(String.valueOf(node.getValue()));
        }
        preorder(node.getLeft());
        preorder(node.getRight());
    }
}
