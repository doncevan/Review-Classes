package reviewClass11;

public class E1ArrayList {
    public static void main(String[] args) {
        //Problems with arrays
        // 1 Arrays are fixed in size
        String[] names = new String[3];
        names[0] = "Leandro";
        names[1] = "Wael";
        names[2] = "Axel";

        //2 No built-in methods are available for arrays
        for (String name : names) {
            System.out.print(name+", ");

            if (name.equals("Axel")) {
                System.out.println();

                System.out.println("Found");

                name.contains("Al");
                System.out.println(name);
            }
        }
    }
}
