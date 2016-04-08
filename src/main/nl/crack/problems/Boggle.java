package main.nl.crack.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Namrata Lele on 4/5/16.
 * http://www.geeksforgeeks.org/boggle-find-possible-words-board-characters/
 */
public class Boggle {
    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("geeks");
        dictionary.add("for");
        dictionary.add("quiz");
        dictionary.add("go");

        char[][] boggle =  {
                {'g','i','z'},
                {'u','e','k'},
                {'q','s','e'}
        };

        System.out.println("Words : " + findWords(boggle, dictionary));
    }

    private static Set<String> findWords(char[][] boggle, Set<String> dictionary) {
        Set<String> result = new HashSet<String>();
        int m = boggle.length;
        int n = boggle[0].length;
        boolean[][] visited = new boolean[m][n];
        Trie trie = new Trie();
        for (String word : dictionary) {
            trie.insert(word);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(boggle, visited, "", i, j, trie, result);
            }
        }
        return result;
    }

    private static void dfs(char[][] boggle, boolean[][] visited, String str, int i, int j, Trie trie, Set<String> result) {
        int m = boggle.length;
        int n = boggle[0].length;
        if (i<0 || j<0|| i>=m || j >=m) {
            return;
        }

        if(visited[i][j]) {
            return;
        }

        str = str + boggle[i][j];

        if (!trie.startsWith(str)) {
            return;
        }

        if (trie.search(str)) {
            result.add(str);
        }

        visited[i][j] = true;
        // Traverse 8 adjacent cells of boggle[i][j]
        for (int row=i-1; row<=i+1 && row<m; row++)
            for (int col=j-1; col<=j+1 && col<n; col++)
                if (row>=0 && col>=0 && !visited[row][col]) {
                    dfs(boggle, visited, str, row, col, trie, result);
                }
        visited[i][j] = false;
    }
}
