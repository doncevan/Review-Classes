package reviewClass04;

public class Array2 {
    public static void main(String[] args) {
        String[] planets = {"Earth", "Mars", "Jupiter", "Saturn", "Neptune"};
        for (String planet : planets) {
            System.out.print(planet+" ");
        }

        System.out.println();
        
        
        
        
        // System.out.println(planets[0]);
        // System.out.println(planets[1]);
        // System.out.println(planets[2]);
        for (int i = 0; i < planets.length; i++) {
            System.out.print(planets[i] + " ");
        }
    }
}
