package reviewClass06;

public class IceCream {
    String flavor, color;
    boolean dairyFree;
    double price;

    void eat() {
        System.out.println("We can eat " + flavor + " ice cream");
    }
    void buy(){
        System.out.println(flavor+" ice cream costs "+price);
    }
}
