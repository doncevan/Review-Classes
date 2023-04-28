package reviewClass02;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter full sentence");
        String sentence=key.nextLine();
        System.out.println("Please enter 1 word");

        String word = key.next();
        System.out.println("Word that was captured = " + word);

        System.out.println("Please enter integer value");
        int number = key.nextInt();
        System.out.println("Enterd number is= " + number);
        System.out.println("Please enter decimal value");
        double decimal = key.nextDouble();
        System.out.println("Decimal value " + decimal);
    }
}
