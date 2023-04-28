package reviewClass02;

public class IfElseIf {
    public static void main(String[] args) {

        int worldCup = 2022;
        if (worldCup == 2022) {
            System.out.println("Host Country is Qatar");
        } else if (worldCup == 2018) {
            System.out.println("Host Country is Russia");
        } else if (worldCup == 2014) {
            System.out.println("Host Country is Brazil");
        }else{  // if none of conditions is true it executes "else"
            System.out.println("Host Country is Unknown");
        }
    }
}
