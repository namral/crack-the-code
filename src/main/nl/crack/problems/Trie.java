package main.nl.crack.problems;

import java.util.Map;

/**
 * Created by Namrata on 4/5/16.
 */
public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        Map<Character, TrieNode> children = root.getChildren();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            TrieNode node;
            if (children.containsKey(c)) {
                node = children.get(c);
            } else {
                node = new TrieNode(c);
                children.put(c, node);
            }
            children = node.getChildren();

            if (i == word.length() - 1) {
                node.setLeaf(true);
            }
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = searchNode(word);
        if (node != null && node.isLeaf()) {
            return true;
        }
        return false;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if(searchNode(prefix) == null)
            return false;
        else
            return true;
    }

    public TrieNode searchNode(String str){
        Map<Character, TrieNode> children = root.getChildren();
        TrieNode node = null;
        for (int i =0; i <  str.length(); i++) {
            char c = str.charAt(i);
            if (children.containsKey(c)) {
                node = children.get(c);
            } else {
                return null;
            }
            children = node.getChildren();
        }
        return node;
    }
}
