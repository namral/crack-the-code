package main.nl.crack.trees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import main.nl.crack.trees.model.Node;
import main.nl.crack.trees.programs.BstInsert;
import main.nl.crack.trees.programs.FindMinDepthOfBinaryTree;
import main.nl.crack.trees.programs.HeightOfBinaryTreeRecursive;
import main.nl.crack.trees.programs.IsBst;
import main.nl.crack.trees.programs.IterativeInorderTraversal;
import main.nl.crack.trees.programs.KthLargestElementInBST;
import main.nl.crack.trees.programs.LCAForBinaryTree;
import main.nl.crack.trees.programs.LevelOrderTraversal;
import main.nl.crack.trees.programs.LowestCommonAncestorForBST;
import main.nl.crack.trees.programs.MirrorTree;
import main.nl.crack.trees.programs.RecursiveInorderTraversal;
import main.nl.crack.trees.programs.RecursivePostOrderTraversal;
import main.nl.crack.trees.programs.RecursivePreorderTraversal;
import main.nl.crack.trees.programs.SearchBST;
import main.nl.crack.trees.programs.SerializeDeserializeBinaryTree;

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
        KthLargestElementInBST.findLargest(root, 0, 2);
        System.out.println("Inorder traversal Iterative");
        IterativeInorderTraversal.inOrder(root);
        System.out.println("Inorder traversal Recursive");
        RecursiveInorderTraversal.inOrder(root);
        System.out.println("Preorder traversal Recursive");
        RecursivePreorderTraversal.preorder(root);
        System.out.println("PostOrder traversal Recursive");
        RecursivePostOrderTraversal.postOrder(root);
        System.out.println("IsBST : " + IsBst.isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println("Level order traversal Iterative");
        LevelOrderTraversal.levelOrderTraversal(root);
        System.out.println("Height of binary tree : " + HeightOfBinaryTreeRecursive.height(root));
        System.out.println("LCA of 1, 7 : " + LowestCommonAncestorForBST.lowestCommonAncestor(root, new Node<Integer>(1), new Node<Integer>(7)).getValue());
        System.out.println("LCA of 4, 7 : " + LCAForBinaryTree.lowestCommonAncestor(root, new Node<Integer>(4), new Node<Integer>(7)).getValue());
        System.out.println("Mirror of tree (Inorder)");
        MirrorTree.mirror(root);
        RecursiveInorderTraversal.inOrder(root);
        MirrorTree.mirror(root);
        System.out.println("Minimum depth of binary tree : " + FindMinDepthOfBinaryTree.minDepth(root));
        List<String> serializedTree = new ArrayList<>();
        SerializeDeserializeBinaryTree.serialize(root, serializedTree);
        System.out.println("Serialized Tree " + serializedTree.toString());
        System.out.println("Preorder traversal Recursive");
        RecursivePreorderTraversal.preorder(root);
        System.out.println("De serialized tree (Preorder traversal) : ");
        RecursivePreorderTraversal.preorder(SerializeDeserializeBinaryTree.deserialize(serializedTree));
        System.out.println("SearchBST 10 " + SearchBST.isPresent(root, 10));
        Node<Integer> univalRoot = new Node<Integer>(5);
        BstInsert.insert(univalRoot, 1, comparator);
        BstInsert.insert(univalRoot, 5, comparator);
        BstInsert.insert(univalRoot, 5, comparator);
        BstInsert.insert(univalRoot, 5, comparator);
        BstInsert.insert(univalRoot, 5, comparator);
        System.out.println("Inorder traversal Recursive");
        RecursiveInorderTraversal.inOrder(univalRoot);
    }
}
