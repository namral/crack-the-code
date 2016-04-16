package main.nl.crack.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Namrata on 4/11/16.
 *
 * Create json for
 *  Input : dict(“a”: “apple”, “b”: dict(“b”: “blueberry”, “c”: “cranberry”))
 *  Expected output String : “{a:apple,b:{b:blueberry,c:cranberry}}”
 */


public class JsonCreator {
    public interface DictEntry {
        public boolean isDict();
    }

    public static class Dict implements DictEntry {
        private Map<String, DictEntry> map;

        public Dict(Map<String, DictEntry> map) {
            this.map = map;
        }

        public boolean isDict() {
            return true;
        }

        public Set<String> getKeys() {
            return map.keySet();
        }

        public DictEntry get(String key) {
            return map.get(key);
        }
    }

    public static class StringWrapper implements DictEntry {

        private String str;

        public StringWrapper(String str) {
            this.str = str;
        }

        public boolean isDict() {
            return false;
        }

        public String getValue() {
            return str;
        }
    }

    /*  Input : dict(“a”: “apple”, “b”: dict(“b”: “blueberry”, “c”: “cranberry”))
     *  Expected output String : “{a:apple,b:{b:blueberry,c:cranberry}}”
     */
    public static void main(String[] args) {
        Map<String, DictEntry> map1 = new HashMap<>();
        map1.put("b", new StringWrapper("blueberry"));
        map1.put("c", new StringWrapper("cranberry"));
        DictEntry dict1 = new Dict(map1);

        Map<String, DictEntry> map = new HashMap<>();
        map.put("a", new StringWrapper("apple"));
        map.put("b", dict1);
        DictEntry dict = new Dict(map);

        System.out.println("Json string : " + convertToJson(dict));
    }

    public static String convertToJson1(DictEntry entry) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (String key : ((Dict)entry).getKeys()) {
            DictEntry subentry = ((Dict)entry).get(key);
            if (!subentry.isDict()) {
                sb.append(key + ":" + ((StringWrapper)subentry).getValue() + ",");
            } else {
                sb.append(key + ":" + convertToJson1(subentry));
            }
        }
        sb.append("}");
        return sb.toString();
    }
    public static String convertToJson(DictEntry entry) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        convertRec(entry, stringBuilder);
        return stringBuilder.toString();
    }

    public static void convertRec(DictEntry dictEntry, StringBuilder result) {
        int i = 0;
        if (dictEntry.isDict()) {
            Dict input = (Dict) dictEntry;
            for (String key : input.getKeys()) {
                if (i != 0) {
                    result.append(",");
                }
                i++;
                result.append(key);
                result.append(":");
                DictEntry entry = input.get(key);
                if (entry.isDict()) {
                    result.append("{");
                    convertRec(entry, result);
                } else {
                    result.append(((StringWrapper) entry).getValue());
                }
            }
        }
        result.append("}");
    }
}
