package main.nl.crack.problems;

/**
 * Created by Namrata on 4/14/16.
 * Coderpad Interview template
 */
class InterviewDS {

    public static class Node {
        private Node left;
        private Node right;
        private Integer value;

        public Node(Integer value) {
            this.value = value;
        }

        public boolean hasLeft() {
            return left != null;
        }

        public boolean hasRight() {
            return right != null;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

    public static Node insert(Node root, Integer value) {
        return null;
    }

    public static void levelOrderTraversal(Node node) {
    }

    public static void main(String[] args) {
        /**
         * Create a BST
         *                           8
         *                    3             10
         *                1       6              14
         *                     4     7      13
         */
        Node root = new Node(8);
        insert(root, 3);
        insert(root, 1);
        insert(root, 6);
        insert(root, 4);
        insert(root, 7);
        insert(root, 10);
        insert(root, 14);
        insert(root, 13);
    }

    /*

        System.out.println("Level order traversal Iterative");
        levelOrderTraversal(root);
    * */
}
