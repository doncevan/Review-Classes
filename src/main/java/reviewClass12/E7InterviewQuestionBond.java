package reviewClass12;

import java.util.HashMap;
import java.util.Map;

public class E7InterviewQuestionBond {
    public static void main(String[] args) {
        // print the numbers with their count(how many times they appeared in the array)
        int[] arr = {10, 20, 10, 30, 40, 50, 20, 30, 70, 80, 70};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int count = 0;
            for (int j : arr) {
                if (i == j) {
                    count++;
                }
            }
            map.put(i, count);
        }
        System.out.println(map);
    }
}