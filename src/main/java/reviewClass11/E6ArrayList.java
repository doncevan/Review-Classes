package reviewClass11;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {

        ArrayList<String> student = new ArrayList<>();
        student.add("Adam");
        student.add("Sarah");
        student.add("Halima");
        student.add("Abdul");
        student.add("Semir");
        student.add("Semir");

        ArrayList<String> feeDefaulters = new ArrayList<>();
        feeDefaulters.add("Axel");
        feeDefaulters.add("Leandro");
        feeDefaulters.add("Farva");
        feeDefaulters.add("Adam");
        student.removeAll(feeDefaulters);
        System.out.println(student);

    }
}