
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SphereChallenge {

    private static double volume(double radius) {
        return (4D / 3D) * Math.PI * Math.pow(radius, 3);
    }

    private static double surfaceArea(double radius) {
        return 4D * Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius: ");
        double radius = scanner.nextDouble();
        scanner.close();
        DecimalFormat df = new DecimalFormat("#.0000");
        df.setRoundingMode(RoundingMode.HALF_UP); // [0, .5) = 0, [.5, 1] = 1
        System.out.println("Volume: " + df.format(volume(radius)));
        System.out.println("Surface Area: " + df.format(surfaceArea(radius)));
    }
}