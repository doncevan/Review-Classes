package reviewClass12;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class E7InterviewQuestionHalima {
    public static void main(String[] args) {
        // print the numbers with their count(how many times they appeared in the array)
        int[] arr = {10, 20, 10, 30, 40, 50, 20, 30, 70, 80, 70};
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, count + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}