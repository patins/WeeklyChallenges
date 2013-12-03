
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SphereChallenge {
    /**
    * volume of a sphere
    */
    private static double volume(double radius) {
        return (4D / 3D) * Math.PI * Math.pow(radius, 3);
    }

    /**
    * surface area of a sphere
    */
    private static double surfaceArea(double radius) {
        return 4D * Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius: "); // request radius
        double radius = scanner.nextDouble(); // read radius
        scanner.close();
        DecimalFormat df = new DecimalFormat("#.0000"); // format to 4 decimal places
        df.setRoundingMode(RoundingMode.HALF_UP); // [0, .5) = 0, [.5, 1] = 1
        System.out.println("Volume: " + df.format(volume(radius))); // format the volume
        System.out.println("Surface Area: " + df.format(surfaceArea(radius))); // format the surface area
    }
}