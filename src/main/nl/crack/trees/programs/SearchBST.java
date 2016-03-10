package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 2/18/16.
 */
public class SearchBST {

    public static boolean isPresent(Node<Integer> node, int val) {
        if(node == null) {
            return false;
        } else if (node.getValue() == val) {
            return true;
        } else if (val < node.getValue()) {
            return isPresent(node.getLeft(), val);
        } else {
            return isPresent(node.getRight(), val);
        }
    }
}
