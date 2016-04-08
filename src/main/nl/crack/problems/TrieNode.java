package main.nl.crack.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Namrata on 4/5/16.
 */
public class TrieNode {
    private char c;
    private Map<Character, TrieNode> children = new HashMap<>();
    private boolean isLeaf;

    public TrieNode() {
    }

    public TrieNode(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }

    public void setLeaf(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }
}
