package reviewClass11;

import java.util.ArrayList;
import java.util.LinkedList;

public class E7ArrayList {
    public static void main(String[] args) {

        LinkedList<String> student = new LinkedList<>();
        student.add("Adam");
        student.add("Sarah");
        student.add("Halima");
        student.add("Abdul");
        student.add("Semir");
        student.add("Semir");
        student.remove("Halima");
        student.add(3, "James");
        System.out.println(student);
        for (String s : student) {
            System.out.print(s+", ");
        }

    }
}