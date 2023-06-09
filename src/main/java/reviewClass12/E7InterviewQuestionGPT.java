package reviewClass12;

import java.util.LinkedHashMap;
import java.util.Map;

public class E7InterviewQuestionGPT {
    public static void main(String[] args) {
        // print the numbers with their count(how many times they appeared in the array)
        int [] arr={10,20,10,30,40,50,20,30,70,80,70};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() +", "+ entry.getValue());
        }
    }
}
