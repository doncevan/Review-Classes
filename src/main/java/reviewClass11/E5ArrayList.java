package reviewClass11;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Adam");
        arrayList.add("Sarah");
        arrayList.add("Halima");
        arrayList.add("Abdul");
        arrayList.add("Semir");
        arrayList.add("Semir");

        //arrayList.removeIf(x -> x.startsWith("A"));
        System.out.println(arrayList);
        //arrayList.removeIf(x -> x.length() > 5);
        System.out.println(arrayList);
        //arrayList.removeIf(x->x.length()%2==1);
        System.out.println(arrayList);
        arrayList.removeIf(x -> x.contains("a") || x.length() > 5);
        System.out.println(arrayList);

    }
}