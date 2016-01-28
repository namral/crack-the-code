package main.nl.crack.trees;

import java.util.Comparator;

import main.nl.crack.trees.model.Node;
import main.nl.crack.trees.programs.BstInsert;
import main.nl.crack.trees.programs.HeightOfBinaryTreeRecursive;
import main.nl.crack.trees.programs.IsBst;
import main.nl.crack.trees.programs.IterativeInorderTraversal;
import main.nl.crack.trees.programs.LevelOrderTraversal;
import main.nl.crack.trees.programs.LowestCommonAncestorForBST;
import main.nl.crack.trees.programs.RecursiveInorderTraversal;
import main.nl.crack.trees.programs.RecursivePostOrderTraversal;

/**
 * Created by Namrata Lele on 1/8/16.
 */
public class TreeMain {
    public static void main(String[] args) {
        /**
         * Create a BST
         *                           8
         *                    3             10
         *                1       6              14
         *                     4     7      13
         */
        Node<Integer> root = new Node<Integer>(8);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
            }
        };
        BstInsert.insert(root, 3, comparator);
        BstInsert.insert(root, 1, comparator);
        BstInsert.insert(root, 6, comparator);
        BstInsert.insert(root, 4, comparator);
        BstInsert.insert(root, 7, comparator);
        BstInsert.insert(root, 10, comparator);
        BstInsert.insert(root, 14, comparator);
        BstInsert.insert(root, 13, comparator);
        System.out.println("Inorder traversal Iterative");
        IterativeInorderTraversal.inOrder(root);
        System.out.println("Inorder traversal Recursive");
        RecursiveInorderTraversal.inOrder(root);
        System.out.println("PostOrder traversal Recursive");
        RecursivePostOrderTraversal.postOrder(root);
        System.out.println("IsBST : " + IsBst.isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println("Level order traversal Iterative");
        LevelOrderTraversal.levelOrderTraversal(root);
        System.out.println("Height of binary tree : " + HeightOfBinaryTreeRecursive.height(root));
        System.out.println("LCA of 1, 7 : " + LowestCommonAncestorForBST.lowestCommonAncestor(root, new Node<Integer>(1), new Node<Integer>(7)).getValue());
    }
}
