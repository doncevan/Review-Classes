package reviewClass05;

public class ArrayRecap {
    public static void main(String[] args) {
        String[] languages = {"English", "Russian", "Turkish", "French", "Spanish", "Geman"};
        for (String language : languages) {
            System.out.print(language + "  ");
        }
        System.out.println();
        System.out.println("--------Reverse--------------");
        for (int i = languages.length-1; i >= 1; i--) {
            System.out.print(languages[i]+" ");
        }
    }

}
