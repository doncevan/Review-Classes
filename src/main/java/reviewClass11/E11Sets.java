package reviewClass11;

import java.util.*;

public class E11Sets {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Ivan");
        names.add("Oksana");
        names.add("Ana");
        names.add("Masoud");
        names.add("Mark");
        names.add("Mark");
        System.out.println(names);
        List<String> list = new ArrayList<>(names);
        System.out.println(list.get(1));
        Collections.sort(list);
        System.out.println(list);
    }
}
