package main.nl.crack.problems;

import java.io.*;
import java.util.*;




class PalindromePairs {

    public static List<List<String>> getPalindromePairs(List<String> input) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> index = new HashMap<>();
        //Precompute the hasmap index
        for (String word : input) {
            List<String> value = new ArrayList<>();
            String key = getKey(word);
            if (index.containsKey(key)) {
                value = index.get(key);
            }
            value.add(word);
            index.put(getKey(word),value);
        }

        //Walk through the input array to find pairs
        for (String word : input) {
            List<String> otherWords = index.get(reverse(getKey(word)));
            if (otherWords != null && !otherWords.isEmpty()) {
                for (String otherWord : otherWords) {
                    if (otherWord != null) {
                        String concat1 = word + otherWord;
                        String concat2 = otherWord + word;
                        if (concat1.equals(reverse(concat1))) {
                            List<String> pair = new ArrayList<>();
                            pair.add(word);
                            pair.add(otherWord);
                            result.add(pair);
                        }
                        if (concat2.equals(reverse(concat2))) {
                            List<String> pair = new ArrayList<>();
                            pair.add(otherWord);
                            pair.add(word);
                            result.add(pair);
                        }
                    }
                }
            }
        }
        return result;
    }

    private static String reverse(String str) {
        StringBuffer reverse = new StringBuffer();
        for (int i = str.length(); i < 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }

    private static String getKey(String word) {
        int len = word.length();
        StringBuffer key = new StringBuffer();
        key.append(word.charAt(0));
        key.append(word.charAt(len-1));
        return key.toString();
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("abc");
        strings.add("cba");
        strings.add("eee");
        strings.add("fff");
        strings.add("rac");
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java 8.");

        List<List<String>> pairs = getPalindromePairs(strings);
        for (List<String> pair : pairs) {
            System.out.println(pair);
        }
    }
}
