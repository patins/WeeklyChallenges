
import java.util.Random;

public class PhoneNumberChallenge {

    private static final Random rand = new Random();

    private static int random(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    private static String generateNumber() {
        String number = "";
        for (int i = 0; i < 3; i++) {
            number += random(1, 7);
        }
        number += "-" + random(101, 742);
        number += "-" + random(1001, 9999);
        return number;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generateNumber());
        }
    }
}