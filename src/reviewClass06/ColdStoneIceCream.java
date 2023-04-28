package reviewClass06;

public class ColdStoneIceCream {
    public static void main(String[] args) {
       IceCream iCream=new IceCream();
       iCream.flavor="Vanilla";
       iCream.color="White";
       iCream.dairyFree=false;
       iCream.price=2.99;
       iCream.eat();
       iCream.buy();

        System.out.println("Second IceCream object---------");

       IceCream iCream2=new IceCream();
        iCream.flavor="Pistachio";
        iCream.color="Green";
        iCream.dairyFree=true;
        iCream.price=5.99;
        iCream.eat();
        iCream.buy();
    }
}
