package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 1/9/16.
 * Left , Right,  Head
 */
public class RecursivePostOrderTraversal<T> {
    public static<T> void postOrder(Node node) {
        if(node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.println(node.getValue());
    }
}
