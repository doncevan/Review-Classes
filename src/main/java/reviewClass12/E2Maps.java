package reviewClass12;

import java.util.HashMap;
import java.util.Map;

public class E2Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Kiwi", 2);
        map.put("Orange", 4);
        map.put("Mango", 3);
        map.put("Banana", 30);
        System.out.println(map);
        // map.remove("Orange");
        // System.out.println(map);
        map.keySet().removeIf(x -> x.contains("a") || x.contains("A"));
        System.out.println(map);
    }
}
