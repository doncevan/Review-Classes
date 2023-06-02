package reviewClass04;

import java.util.Scanner;

public class ArrayAndScanner {
    public static void main(String[] args) {
        /*create an array that stores numbers from a user and then we want to calculate the average of numbers*/
        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers you want to store?");
        int size = scan.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter " + (i + 1) + " element");
            numbers[i] = scan.nextInt();
        }
        int sum = 0;
        for (int p : numbers)
            sum += p;
        System.out.print("The average is : " + (sum / size));
    }
}
