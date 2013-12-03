
import java.util.Scanner;

public class TemperatureChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter °F: "); // request temperature in f
        double fahrenheit = scanner.nextDouble(); // read it
        scanner.close();
        double celcius = (int) Math.round((fahrenheit - 32D) * (5D / 9D)); // convert it
        System.out.println(celcius + " °C"); // print it
    }
}