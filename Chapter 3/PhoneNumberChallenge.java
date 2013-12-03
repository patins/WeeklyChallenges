
import java.util.Random;

public class PhoneNumberChallenge {

    private static final Random rand = new Random();

    /**
    * generate a random number between min and max, inclusive
    */
    private static int random(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    /**
    * generate a phone number
    */
    private static String generateNumber() {
        String number = "";
        for (int i = 0; i < 3; i++) { // for 3 times
            number += random(1, 7); // generate a number between 1 and 7
        }
        number += "-" + random(101, 742);
        number += "-" + random(1001, 9999);
        return number;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // do it ten times
            System.out.println(generateNumber());
        }
    }
}