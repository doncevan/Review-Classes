package reviewClass02;

public class IfElse {
    public static void main(String[] args) {

        int age = 18;
        if (age >= 18) {  //  true
            System.out.println("You can get a DL");
        } else {
            System.out.println("You are to yong to drive");


        }
        String expected = "Best sellers";
        if (expected.equals("Best Sellers")) {  // false
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }


    }
}
