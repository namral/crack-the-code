package main.nl.crack.trees.model;

/**
 * Created by Namrata Lele on 12/29/15.
 */
public class Node<T> {
    private Node<T> left;
    private Node<T> right;
    private T value;

    public Node(T value) {
        this.value = value;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

