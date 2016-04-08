package main.nl.crack.problems;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nlele on 2/19/16.
 */
public class PaginationProblem {
  
  /*
  
  1/ we want 12 results per page
  2/ we want results sorted by score
  3/ On each page, we want listings from different cities
  
  
"city_id,deal_id,score",
"1,28,300.1",
"4,5,209.1",
"20,7,208.1",
"23,8,207.1",
"16,10,206.1",
"1,16,205.1",
"1,31,204.6",
"6,29,204.1",
"7,20,203.1",
"8,21,202.1",
"2,18,201.1",
"2,30,200.1",
"15,27,109.1",
"10,13,108.1",
"11,26,107.1",
"12,9,106.1",
"13,1,105.1",
"22,17,104.1",
"1,2,103.1",
"28,24,102.1",
"18,14,11.1",
"6,25,10.1",
"19,15,9.1",
"3,19,8.1",
"3,11,7.1",
"27,12,6.1",
"1,3,5.1",
"25,4,4.1",
"5,6,3.1",
"29,22,2.1",
"30,23,1.1"
  
  */

    public static String[] input = {
            "1,28,300.1",
            "4,5,209.1",
            "20,7,208.1",
            "23,8,207.1",
            "16,10,206.1",
            "1,16,205.1",
            "1,31,204.6",
            "6,29,204.1",
            "7,20,203.1",
            "8,21,202.1",
            "2,18,201.1",
            "2,30,200.1",
            "15,27,109.1",
            "10,13,108.1",
            "11,26,107.1",
            "12,9,106.1",
            "13,1,105.1",
            "22,17,104.1",
            "1,2,103.1",
            "28,24,102.1",
            "18,14,11.1",
            "6,25,10.1",
            "19,15,9.1",
            "3,19,8.1",
            "3,11,7.1",
            "27,12,6.1",
            "1,3,5.1",
            "25,4,4.1",
            "5,6,3.1",
            "29,22,2.1",
            "30,23,1.1"
    };

    public static List<List<String>> paginate(String[] input) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> index = getIndex(input);

        List<String> page = new ArrayList<>();
        boolean finish = false;
        while(!finish) {
            finish = true;
            for (Map.Entry<String, List<String>> entry : index.entrySet()) {
                if (page.size() == 12) {
                    result.add(page);
                    page = new ArrayList<>();
                    break;
                }
                List<String> tuples = entry.getValue();
                if (tuples.size() >= 1) {
                    page.add(tuples.remove(0));
                    finish = false;
                }
            }
        }
        result.add(page);
        return result;
    }

    private static Map<String, List<String>> getIndex(String[] input) {
        Map<String, List<String>> index = new LinkedHashMap<>();
        for (int i = 0; i< input.length; i++) {
            String tuple = input[i];
            int k = tuple.indexOf(',');
            String cityId = tuple.substring(0, k);

            List<String> value = getValue(cityId, index);
            value.add(tuple);
            index.put(cityId, value);
        }
        return index;
    }

    private static List<String> getValue(String key, Map<String, List<String>> index) {
        if (index.containsKey(key)) {
            return index.get(key);
        } else {
            return new ArrayList<>();
        }
    }
    public static void main(String[] args) {
        List<List<String>> pages = paginate(input);
        int pageN = 0;
        System.out.println("PAGINATION RESULT");
        for (List<String> tuples : pages) {
            System.out.println("page number" + pageN);
            for (String tuple : tuples) {
                System.out.println(tuple);
            }
            pageN++;
        }
    }
}
