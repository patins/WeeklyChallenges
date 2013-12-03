
import java.util.Random;

public class CylinderChallenge {

    private static final Random rand = new Random();

    /**
    * generate a random number between min and max, inclusive
    */
    private static int random(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    /**
    * volume of a cylinder
    **/
    private static double volume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    /**
    * surface area of a cylinder
    */
    private static double surfaceArea(double radius, double height) {
        return 2D * Math.PI * radius * height;
    }

    public static void main(String[] args) {
        int radius = random(20, 40); // generate a random height and radius
        int height = random(20, 40);
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + Math.round(volume(radius, height))); // calculate the volume
        System.out.println("Surface Area: " + Math.round(surfaceArea(radius, height))); // calculate the surface area
    }
}