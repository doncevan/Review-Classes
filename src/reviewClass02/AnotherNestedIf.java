package reviewClass02;

public class AnotherNestedIf {
    public static void main(String[] args) {

        boolean vaccine = true;
        int dose = 3;
        if (vaccine) {
            if (dose == 1) {
                System.out.println("You need a second dose");
            } else if (dose == 2) {
                System.out.println("You are fully vaccinated");
            } else if (dose == 3) {
                System.out.println("You are fully vaccinated with a booster");
            }
        }
    }
}
