package main.nl.crack.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by nlele on 2/28/16.
 * http://www.geeksforgeeks.org/length-of-shortest-chain-to-reach-a-target-word/
 */
public class ShortestChainForTargetWord {

    static class QItem {
        String word;
        int len;

        public QItem(String word, int len) {
            this.word = word;
            this.len = len;
        }
    };

    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("poon");
        dictionary.add("plee");
        dictionary.add("same");
        dictionary.add("poie");
        dictionary.add("plie");
        dictionary.add("poin");

        System.out.println(getChain(dictionary, "toon", "plea"));
    }

    private static int getChain(List<String> dictionary, String source, String target) {
        Queue<QItem> queue = new LinkedList<>();
        queue.add(new QItem(source, 1));
        while (!queue.isEmpty()) {
            QItem node = queue.remove();
            if (isAdjacent(node.word.toCharArray(), target.toCharArray())) {
                return node.len;
            }
            addNeighbors(queue, node, dictionary);
        }
        return 0;
    }

    private static void addNeighbors(Queue<QItem> queue, QItem node, List<String> dictionary) {
        for (int i = 0; i< dictionary.size(); i++) {
            if (isAdjacent(node.word.toCharArray(), dictionary.get(i).toCharArray())) {
                queue.add(new QItem(dictionary.get(i), node.len + 1));
                dictionary.remove(i);
            }
        }
    }

    // To check if strings differ by exactly one character
    private static boolean isAdjacent(char[] src, char[] tar)
    {
        int count = 0;  // to store count of differences
        int n = src.length;

        // Iterate through all characters and return false
        // if there are more than one mismatching characters
        for (int i = 0; i < n; i++)
        {
            if (src[i] != tar[i]) count++;
            if (count > 1) return false;
        }
        return count == 1 ? true : false;
    }

}
