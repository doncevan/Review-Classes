package reviewClass03;

public class logicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplayed = true;
        boolean loginClickable = true;
        if (loginButtonDisplayed && loginClickable) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        System.out.println("--------------LOGICAL OR ---------------------------");

        boolean pictureDisplayed = true;
        String accountName = "Syntax";
        if (pictureDisplayed || accountName.equals("Syntax")) {
            System.out.println("Login was succesfull");
        } else {
            System.out.println("User was not able to login");
        }

        System.out.println("--------------LOGICAL NOT ---------------------------");
        boolean hungry =true;
        System.out.println(hungry);

        boolean cold=false;
        System.out.println(!cold);

        String str="Bye";
        if (!str.equals("Hello")){
            System.out.println("Value of the string is NOT hello");
        }

        boolean confirmSelected=false;
        if (!confirmSelected){
            System.out.println("Let's click on confirm checkbox");
        }else{
            System.out.println("Click on Pay button");

        }
    }

}
