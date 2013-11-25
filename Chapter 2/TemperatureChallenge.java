
import java.util.Scanner;

public class TemperatureChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ?F: ");
        double fahrenheit = scanner.nextDouble();
        scanner.close();
        double celcius = (int) Math.round((fahrenheit - 32D) * (5D / 9D));
        System.out.println(celcius + " ?C");
    }
}