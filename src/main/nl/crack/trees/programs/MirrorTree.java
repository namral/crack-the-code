package main.nl.crack.trees.programs;


import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 2/7/16.
 * Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.
 */
public class MirrorTree<T> {

	public static<T> void mirror(Node<T> node) {
		if (node == null) {
			return;
		} else {
			mirror(node.getLeft());
			mirror(node.getRight());
            Node<T> temp = node.getLeft();
			node.setLeft(node.getRight());
			node.setRight(temp);
		}
	}
}
