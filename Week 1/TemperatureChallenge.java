import java.util.Scanner;

public class TemperatureChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter °F: ");
        double fahrenheit = scanner.nextDouble();
        scanner.close();
        double celcius  = (fahrenheit - 32) * (5/9);
        System.out.println(celcius + " °C");
    }
}