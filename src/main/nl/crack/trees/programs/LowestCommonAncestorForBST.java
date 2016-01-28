package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 1/10/16.
 * Lowest common ancestor
 */
public class LowestCommonAncestorForBST<T> {
    public static Node<Integer> lowestCommonAncestor(Node<Integer> root, Node<Integer> node1, Node<Integer> node2) {
        if (root == null) {
            return null;
        }
        if(root.getValue() > node2.getValue() && root.getValue() > node1.getValue()) {
            return lowestCommonAncestor(root.getLeft(), node1, node2);
        } else if(root.getValue() < node2.getValue() && root.getValue() < node1.getValue()) {
            return lowestCommonAncestor(root.getRight(), node1, node2);
        }
        return root;
    }
}
